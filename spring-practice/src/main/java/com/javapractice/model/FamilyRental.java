package com.javapractice.model;

import java.util.ArrayList;

public interface FamilyRental {
    public boolean checkInfo();
    public void calculateFee(ArrayList<Rental> rentals, int discount);
    public Double getFee();
    public Integer getQty();
}