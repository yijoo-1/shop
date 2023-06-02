package com.example.shop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@Setter
@Entity
public class Member {
    @Id @GeneratedValue
    private long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;

    public Member() {
    }
}
