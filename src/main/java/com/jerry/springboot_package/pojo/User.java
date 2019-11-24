package com.jerry.springboot_package.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private int id;
    private String name;
    private int age;
    public User(int id,String name)
    {
        super();
        this.id=id;
        this.name=name;
    }
}
