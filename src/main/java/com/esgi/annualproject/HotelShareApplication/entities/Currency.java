package com.esgi.annualproject.HotelShareApplication.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name = "CURRENCY")
public class Currency extends AuditModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CURRENCY")
    private long idCurrency;

    @Column(name = "NAME_CURRENCY")
    private String nameCurrency;
}
