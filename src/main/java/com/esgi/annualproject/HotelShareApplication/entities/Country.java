package com.esgi.annualproject.HotelShareApplication.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name = "COUNTRY")
public class Country extends AuditModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COUNTRY")
    private long idCountry;

    @Column(name = "NAME_COUNTRY")
    private String nameCountry;
}
