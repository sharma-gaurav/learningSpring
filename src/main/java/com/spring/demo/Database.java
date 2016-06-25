package com.spring.demo;

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

    public Database(String name) {
        this.name = name;
    }

    public Database(Integer port, String name) {
        this.port = port;
        this.name = name;
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
}
