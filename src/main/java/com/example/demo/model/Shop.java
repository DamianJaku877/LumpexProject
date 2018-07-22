package com.example.demo.model;

import javax.persistence.*;
import java.util.Timer;

@Entity
@Table(name = "shop")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String shopName;
    private String city;
    private String postCode;
    private String street;
    private String home;
    private float price;
    private float open;
    private float close;

    public Shop(){}
    public Shop(long id){}

    public Shop(String shopName, String city, String postCode, String street, String home, float price, float open, float close) {
        this.shopName = shopName;
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        this.home = home;
        this.price = price;
        this.open = open;
        this.close = close;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                ", street='" + street + '\'' +
                ", home='" + home + '\'' +
                ", price=" + price +
                ", open=" + open +
                ", close=" + close +
                '}';
    }
}
