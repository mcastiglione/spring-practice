package com.javapractice.model;

import java.util.List;

public interface FamilyRental {
    public boolean isInfoOK();
    public void calculateFee(List<Rental> rentals, int discount);
    public Double getFee();
    public Integer getQty();
}