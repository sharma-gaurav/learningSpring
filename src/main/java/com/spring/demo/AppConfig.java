package com.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="hotDrink")
    Tea tea() {
        return new Tea();
    }

    @Bean
    ExpressTea expressTea() {
        return new ExpressTea();
    }

    @Bean
    Restaurant restaurant(HotDrink hotDrink) {
        return new Restaurant(hotDrink);
    }
}
