package com.javapractice.model;

import java.util.ArrayList;

public interface FamilyRental {
    boolean isInfoOK();

    void calculateFee();

    void logValues();

    Double getFee();

    Integer getQty();

    Integer getDiscount();

    String data();

    void setRentals(ArrayList<String[]> rentals);
}