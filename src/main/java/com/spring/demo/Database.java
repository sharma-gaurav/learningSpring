package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class Database {
    String name;
    Integer port;

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", port=" + port +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void connect() {
        System.out.println("This is connect method");
    }
}
