package com.esgi.annualproject.HotelShareApplication.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/*
 *  A VOIR COMMENT STOCKER LES IMAGES ET LES INFOS REQUISES
 */
@Entity
@Table(name = "PICTURE")
public class Picture extends AuditModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PICTURE")
    private long idLanguage;

    @Column(name = "picture")
    private String picture;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST, CascadeType.MERGE
            },
            mappedBy = "pictures")
    private Set<UserProfile> userProfile;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST, CascadeType.MERGE
            },
            mappedBy = "pictures")
    private Set<Hotel> hotels;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST, CascadeType.MERGE
            },
            mappedBy = "pictures")
    private Set<Room> rooms;
}
