package com.esgi.annualproject.HotelShareApplication.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class TimeZone extends AuditModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIMEZONE")
    private long idTimeZone;

    @Column(name = "ABBREVIATION")
    private String abbreviation;

    @Column(name = "NAME_TIMEZONE")
    private String nameTimeZone;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "OFFSET")
    private String offset;
}
