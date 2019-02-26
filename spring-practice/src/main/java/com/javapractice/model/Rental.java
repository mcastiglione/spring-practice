package com.javapractice.model;

public interface Rental {
    boolean isInfoOK();

    void calculateFee();

    void logValues();

    Double getFee();

    Integer getQty();

    String data();
}