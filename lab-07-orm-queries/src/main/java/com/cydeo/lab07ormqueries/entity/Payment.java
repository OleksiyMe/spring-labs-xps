package com.cydeo.lab07ormqueries.entity;

import com.cydeo.lab06orm.enums.PaymentMethod;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Payment extends BaseEntity{

    private BigDecimal paid_price;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;


}
