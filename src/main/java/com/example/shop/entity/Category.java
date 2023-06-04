package com.example.shop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Category {
    @Id
    private Long id;
    @ManyToMany(@JoinTable(name = "CATEGORY_ITEM"),@JoinColumn(name = "PARENT_ID"))
    private Item item;
}
