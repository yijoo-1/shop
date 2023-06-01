package com.example.shop.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class OrderItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    int orderPrice;
    int count;
}
