package com.cydeo.lab06orm.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="orders")
public class Order extends BaseEntity{

    private BigDecimal paidPrice, totalPrice;
    @OneToOne
    private Cart cart;
    @OneToOne
    private Customer customer;
    @OneToOne
    private Payment payment;

}
