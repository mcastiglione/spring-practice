package com.java.javapractice.model;

public interface Rental {
    public boolean isInfoOK();
    public void calculateFee(int vehicleQty, int timeQty);
    public void logValues();
    public Double getFee();
    public Integer getQty();
}