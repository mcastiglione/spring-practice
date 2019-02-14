package com.javapractice.model;

import com.javapractice.model.bike.BikeParams;

public interface Rental {
    public boolean isInfoOK();
    public void calculateFee();
    public void logValues();
    public Double getFee();
    public Integer getQty();
}