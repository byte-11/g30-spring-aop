package uz.pdp;

import java.util.Random;


public class Performance {
    public void perform() {
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println("Boolean is true");
        } else {
            throw new IllegalStateException("Boolean is false");
        }
    }
}
