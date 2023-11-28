package uz.pdp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public Performance performance(){
        return new Performance();
    }

    @Bean
    public PerformListener performListener(){
        return new PerformListener();
    }
}
