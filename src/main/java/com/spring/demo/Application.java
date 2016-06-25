package com.spring.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("springIntermediateConfig.xml");
        Database db = ctx.getBean(Database.class);
        System.out.println(db);

    }
}
