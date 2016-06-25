package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class Tea implements HotDrink {
    @Override
    public String prepareHotDrink() {
        return "This is Tea";
    }
}
