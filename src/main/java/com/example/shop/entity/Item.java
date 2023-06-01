package com.example.shop.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    int price;
    int stockQuantity;
}
