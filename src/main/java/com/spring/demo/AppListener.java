package com.spring.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppListener {

    @EventListener(ContextRefreshedEvent.class)
    public void onEvent(ContextRefreshedEvent event) {
        System.out.println(event);
    }

    @EventListener(ContextStartedEvent.class)
    public void onEvent(ContextStartedEvent event) {
        System.out.println(event);
    }

    @EventListener(CustomEvent.class)
    public void onEvent(CustomEvent event) {
        System.out.println(event);
    }
}
