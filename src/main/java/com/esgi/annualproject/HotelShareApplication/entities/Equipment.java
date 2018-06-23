package com.esgi.annualproject.HotelShareApplication.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "EQUIPMENT")
public class Equipment extends AuditModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EQUIPMENT")
    private long idEquipment;

    @Column(name = "NAME_EQUIPMENT")
    private String nameEquipment;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST, CascadeType.MERGE
            },
            mappedBy = "equipments")
    private Set<Hotel> hotels;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST, CascadeType.MERGE
            },
            mappedBy = "equipments")
    private Set<Room> rooms;
}
