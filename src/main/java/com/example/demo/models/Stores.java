package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table (name = "stores")
@ToString
public class Stores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    @Column (name = "id")
    private Integer id;

    @Getter @Setter
    @Column (name = "name")
    private String name;

    @Getter @Setter
    @Column (name = "address")
    private String address;

    @Getter @Setter
    @Column (name = "city")
    private String city;

    @Getter @Setter
    @Column (name = "openingHours")
    private String openingHours;
}
