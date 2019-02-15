package com.javapractice.model;

import java.util.ArrayList;

public interface FamilyRental {
    public boolean isInfoOK();
    public void calculateFee();
    public void logValues();
    public Double getFee();
    public Integer getQty();
    public Integer getDiscount();
    public String printData();
    public void setRentals(ArrayList<Rental> rentals);
}