package com.spring.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Restaurant implements InitializingBean, DisposableBean {
    @Autowired
    HotDrink hotDrink;

    public Restaurant() {
    }

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    String getMyDrink() {
        return hotDrink.prepareHotDrink();
    }

    void initMethod() {
        System.out.println("Initializing using init-method");
    }

    void destroyMethod() {
        System.out.println("Destroying using destroy-method");
    }

    @PostConstruct
    void postConstructInit() {
        System.out.println("Initializing using post-construct annotation");
    }

    @PreDestroy
    void preDestroyInit() {
        System.out.println("Destroying using pre-destroy annotation");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing using afterPropertiesSet in InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying using destroy in DisposableBean");
    }
}
