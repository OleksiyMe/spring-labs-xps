package com.cydeo.lab07ormqueries.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CartItem extends BaseEntity {

    private Long quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cart cart;
    @ManyToOne
    private Product product;



}
