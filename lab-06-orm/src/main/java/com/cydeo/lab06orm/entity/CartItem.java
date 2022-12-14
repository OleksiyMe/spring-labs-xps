package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CartItem extends BaseEntity{

    private Long quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cart cart;
    @ManyToOne
    private Product product;



}
