package com.javapractice.model;

//import com.javapractice.utility.DbReader;
import com.javapractice.utility.ReadProperties;


public interface Rental {

    //public static final DbReader db = DbReader.getInstance();
    public static final ReadProperties file = ReadProperties.getInstance();

    public boolean checkInfo();
    public void calculateFee(int vehicleQty, int timeQty);
    public Double getFee();
    public Integer getQty();
}