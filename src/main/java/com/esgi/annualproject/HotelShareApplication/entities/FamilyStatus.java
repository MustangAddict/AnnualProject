package com.esgi.annualproject.HotelShareApplication.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name = "FAMILY_STATUS")
public class FamilyStatus extends AuditModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_STATUS")
    private long idStatus;

    @Column(name = "NAME_STATUS")
    private String nameStatus;
}
