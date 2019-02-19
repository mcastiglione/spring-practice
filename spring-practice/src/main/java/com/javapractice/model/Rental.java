package com.javapractice.model;

public interface Rental {
    public boolean isInfoOK();
    public void calculateFee();
    public void logValues();
    public Double getFee();
    public Integer getQty();
    public String data();
    public void setParams(Params params);
}