package com.mlhoste.magicpony.entity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Child extends Person {

    private Date birthDate;

    private int weigth = 0;

    private int height = 0;

    public int getWeigth() {

        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
