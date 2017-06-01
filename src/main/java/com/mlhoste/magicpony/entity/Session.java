package com.mlhoste.magicpony.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date startDate;

    private Date endDate;

    @OneToMany
    private List<Instructor> instructorList = new ArrayList<>(1);

    @OneToMany
    private Map<Child, Pony> childAndPonyMap = new HashMap<>(10);

    protected Session() {
    }
}
