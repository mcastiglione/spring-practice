package com.javapractice.model;

public interface FamilyRental {
    boolean isInfoOK();

    void process();

    void logValues();

    Double getFee();

    Integer getQty();

    Integer getDiscount();

    String data();

    void setRentals(ParamsArr paramsArr);
}