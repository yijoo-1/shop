package com.example.shop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Member {
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private long id;
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<Order>();
    private String name;
    private String city;
    private String street;
    private String zipcode;

    public Member() {
    }
}
