package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ctx.registerShutdownHook();
//        Database db = (Database) ctx.getBean("database");
//        System.out.println(db);

        Restaurant restaurant = ctx.getBean("restaurant", Restaurant.class);
        System.out.println(restaurant.getMyDrink());

//        Restaurant teaRestaurant = ctx.getBean("teaRestaurant", Restaurant.class);
//        System.out.println(teaRestaurant.getMyDrink());

//        Restaurant expressTeaRestaurant = ctx.getBean("expressTeaRestaurant", Restaurant.class);
//        System.out.println(expressTeaRestaurant.getMyDrink());

//        Complex complex = ctx.getBean("complex", Complex.class);
//        System.out.println(complex);

//        Triangle triangle = ctx.getBean("triangle", Triangle.class);
//        System.out.println(triangle);


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Restaurant restaurant2 = context.getBean("restaurant", Restaurant.class);
        System.out.println(restaurant2.getMyDrink());

    }
}
