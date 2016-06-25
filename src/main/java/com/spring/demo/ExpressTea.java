package com.spring.demo;

import org.springframework.stereotype.Component;

@Component("hotDrink")
public class ExpressTea implements HotDrink {
    @Override
    public String prepareHotDrink() {
        return "This is ExpressTea";
    }
}
