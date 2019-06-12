package com.test.spring.domain;

import java.io.Serializable;

public class Address implements Serializable {

    private static final long serialVersionUID = -3698159809335405179L;

    private String street;
    private Integer apartment;
    private String number;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getApartment() {
        return apartment;
    }

    public void setApartment(Integer apartment) {
        this.apartment = apartment;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
