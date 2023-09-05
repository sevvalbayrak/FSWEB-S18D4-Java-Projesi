package com.workintech.manytoone.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "address", schema = "spring")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="city")
    private String city;

    @Column(name="street")
    private String street;

    @Column(name="no")
    private int no;

    @Column(name="country")
    private String country;

    @Column(name = "description")
    private String description;

    @JsonIgnore
    @OneToOne(cascade = {
                CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH
    },mappedBy = "address")
    private Customer customer;

}
