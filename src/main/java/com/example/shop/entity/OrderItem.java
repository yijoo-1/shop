package com.example.shop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter@Setter
@Entity
public class OrderItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long orderId;
    private long itemId;
    private int orderPrice;
    private int count;

    public OrderItem() {
    }
}
