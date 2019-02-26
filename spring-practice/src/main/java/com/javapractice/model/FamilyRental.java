package com.javapractice.model;

import java.util.Map;

public interface FamilyRental {
    public boolean checkInfo();

    void process();

    void logValues();

    Double getFee();

    Integer getQty();

    Integer getDiscount();

    String data();

    void setRentals(Map<String, String> rentalData);
}