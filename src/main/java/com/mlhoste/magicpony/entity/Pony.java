package com.mlhoste.magicpony.entity;

import javax.persistence.*;

@Entity
public class Pony {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String surName;

    @OneToOne
    private Club club;

    protected Pony() {
    }
}
