package com.cydeo.lab07ormqueries.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer extends BaseEntity {

    private String email, first_name, last_name, user_name;


}
