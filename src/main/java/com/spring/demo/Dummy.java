package com.spring.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Dummy {

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List getList() {
        return list;
    }

    public Map getMap() {
        return map;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    @Value("#{'Dummy'}")
    String name;

    @Value("#{23}")
    Integer age;

    @Value("#{{1,2,3,4}}")
    List list;

    @Value("#{{a:1,b:2,c:3}}")
    Map map;

    @Value("#{systemProperties['user.country']}")
    String country;

    @Value("${state}")
    String state;

    public static Integer getInteger() {
        return 50;
    }

    @Override
    public String toString() {
        return "Dummy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                ", map=" + map +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }


// getters of all instance variables
}
