package com.esgi.annualproject.HotelShareApplication.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

public class CreditCard extends AuditModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CREDITCARD")
    private long idCreditCard;

    @Column(name = "NAME_CREDITCARD")
    private String nameCreditCard;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST, CascadeType.MERGE
            },
            mappedBy = "creditCards")
    private Set<Hotel> hotels;
}
