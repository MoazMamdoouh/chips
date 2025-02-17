package com.example.demo;


public class Pojo {

    String name ;
    String description ;
    String litter ;

    public Pojo(String name, String description, String litter) {
        this.name = name;
        this.description = description;
        this.litter = litter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLitter() {
        return litter;
    }

    public void setLitter(String litter) {
        this.litter = litter;
    }
}
