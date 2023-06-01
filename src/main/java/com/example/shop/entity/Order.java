package com.example.shop.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;

public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    Data orderDate;
    OrderStatus status;
}
