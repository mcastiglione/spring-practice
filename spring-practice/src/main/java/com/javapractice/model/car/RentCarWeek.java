package com.javapractice.model.car;

import com.javapractice.model.Rental;

public class RentCarWeek implements Rental {

    private Double fee;

    private Integer bikes;

    private Integer weeks;

    private Integer costPerWeek;

    public boolean isInfoOK() {
        return false;
    }

    public void calculateFee() {

    }

    public void logValues() {

    }

    public Double getFee() {
        return null;
    }

    public Integer getQty() {
        return null;
    }
}