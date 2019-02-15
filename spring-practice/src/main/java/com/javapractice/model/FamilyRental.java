package com.javapractice.model;

public interface FamilyRental {
    public boolean isInfoOK();
    public void calculateFee();
    public void logValues();
    public Double getFee();
    public Integer getQty();
    public Integer getDiscount();
    public String printData();
}