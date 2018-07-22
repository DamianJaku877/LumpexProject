package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "lociation")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    double x;
    double y;
    public Location(){}
    public Location(long id){}

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                ", id=" + id +
                '}';
    }
}
