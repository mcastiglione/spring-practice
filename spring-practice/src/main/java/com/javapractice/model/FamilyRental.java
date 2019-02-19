package com.javapractice.model;

import java.util.ArrayList;

public interface FamilyRental {
    public boolean isInfoOK();
    public void calculateFee();
    public void logValues();
    public Double getFee();
    public Integer getQty();
    public Integer getDiscount();
    public String data();
    public void setRentals(ArrayList<String[]> rentals);
}