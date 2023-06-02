package com.example.shop.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@Setter
@Entity
public class Item {
    @Id @GeneratedValue
    private long id;
    private String name;
    private int price;
    private int stockQuantity;

    public Item() {
    }
}
