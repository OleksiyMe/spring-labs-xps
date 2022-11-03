package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CartItem extends BaseEntity{

    private Long quantity;

    @OneToOne
    private Cart cart;
    @OneToOne
    private Product product;



}
