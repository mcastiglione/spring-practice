package com.javapractice.model.car;

import com.javapractice.model.Rental;

public class RentCarDay implements Rental {


    private CarParams carParams;


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