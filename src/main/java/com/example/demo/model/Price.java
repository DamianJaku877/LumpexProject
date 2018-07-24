package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "price")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private float monday;
    private float tuesday;
    private float wednesday;
    private float thursday;
    private float friday;
    private float saturday;
    private float sunday;
    @OneToOne
    private Shop shop;

    public Price(){}
    public Price(long id){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getMonday() {
        return monday;
    }

    public void setMonday(float monday) {
        this.monday = monday;
    }

    public float getTuesday() {
        return tuesday;
    }

    public void setTuesday(float tuesday) {
        this.tuesday = tuesday;
    }

    public float getWednesday() {
        return wednesday;
    }

    public void setWednesday(float wednesday) {
        this.wednesday = wednesday;
    }

    public float getThursday() {
        return thursday;
    }

    public void setThursday(float thursday) {
        this.thursday = thursday;
    }

    public float getFriday() {
        return friday;
    }

    public void setFriday(float friday) {
        this.friday = friday;
    }

    public float getSaturday() {
        return saturday;
    }

    public void setSaturday(float saturday) {
        this.saturday = saturday;
    }

    public float getSunday() {
        return sunday;
    }

    public void setSunday(float sunday) {
        this.sunday = sunday;
    }

}
