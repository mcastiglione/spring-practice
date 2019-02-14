package com.javapractice.model;

import com.javapractice.utility.ReadProperties;

public interface Rental {
    //public static final DbReader db = DbReader.getInstance();
    public static final ReadProperties file = ReadProperties.getInstance();

    public boolean isInfoOK();
    public void calculateFee();
    public void logValues();
    public Double getFee();
    public Integer getQty();
}