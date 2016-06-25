package com.spring.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dummy2 {
    @Value("#{dummy.getName()}")
    String name;

    @Value("#{dummy.getAge()}")
    Integer age;

    @Value("#{T(com.spring.demo.Dummy).getInteger()}")
    Integer integerValue;

    @Override
    public String toString() {
        return "Dummy2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", integerValue=" + integerValue +
                '}';
    }
}
