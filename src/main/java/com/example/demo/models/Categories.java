package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "categories")
public class Categories {
    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    @Getter @Setter
    @Column (name = "id")
    private Integer id;

    @Getter @Setter
    @Column (name = "name")
    private String name;

}
