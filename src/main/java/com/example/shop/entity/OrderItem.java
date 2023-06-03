package com.example.shop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter@Setter
@Entity
public class OrderItem {
    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private long id;
    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;
    private int orderPrice;
    private int count;

    public OrderItem() {
    }

//    public void setOrder(Order order) {
//        if (this.order != null) {
//            order.getOrderItems().remove(this);
//        }
//        this.order = order;
//        order.getOrderItems().add(this);
//    }

}
