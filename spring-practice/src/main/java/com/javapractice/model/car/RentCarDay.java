package com.javapractice.model.car;

import com.javapractice.model.Rental;
import com.javapractice.utility.ReadProperties;

public class RentCarDay implements Rental {

    private Double fee;

    private Integer bikes;

    private Integer days;

    private Integer costPerDay;

    public RentCarDay() {
        this.costPerDay = Integer.parseInt(file.getProperty("car.day"));
    }

    @Override
    public boolean checkInfo() {
        // TODO Auto-generated method stub
        return false;
    }

    public void calculateFee(int bikes, int days) {
        this.bikes = bikes;
        this.days = days;
        this.fee = this.bikes.doubleValue()*this.days.doubleValue()*costPerDay.doubleValue();
    }

    @Override
    public Double getFee() {
        return this.fee;
    }

    public Integer getQty() {
        return this.bikes;
    }

    public Integer getDays() {
        return this.days;
    }

    public Integer getCostPerDay() {
        return this.costPerDay;
    }

    @Override
    public String toString() {
        return new String("You will rent " + this.bikes + " bikes for " + this.days + " days for a total fee of " + this.fee);
    }
}