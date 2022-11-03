package com.cydeo.lab06orm.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
//@Table(name="public.catecory")
public class Category extends BaseEntity {

    private String Name;




}
