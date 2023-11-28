package uz.pdp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PerformListener {
    @Before("execution(* uz.pdp.Performance.perform(..))")
    public void start() {
        System.out.println("Starting...");
    }

    @After("execution(* uz.pdp.Performance.perform(..))")
    public void complete() {
        System.out.println("Complete...");
    }

    @AfterReturning("execution(* uz.pdp.Performance.perform(..))")
    public void result() {
        System.out.println("Resulting...");
    }

    @AfterThrowing("execution(* uz.pdp.Performance.perform(..))")
    public void exception() {
        System.out.println("Exception occurring...");
    }

}
