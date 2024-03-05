package com.estsoft.hellospring.controller;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private  Long id;
    @Column(name = "name", nullable = false)
    private  String name;
    @Override
    public String toString(){
        return "Member{" +
                "id= " + id +
                ", name ='" + name + '\'' +
                '}';
    }
//    private String phone;
}
