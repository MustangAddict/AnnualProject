package com.esgi.annualproject.HotelShareApplication.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class RoomType extends AuditModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ROOMTYPE")
    private long idRoomType;

    @Column(name = "NAME_ROOMTYPE")
    private String nameRoomType;
}
