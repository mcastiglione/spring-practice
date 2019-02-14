package com.javapractice.model.car;

import com.javapractice.model.Rental;
import com.javapractice.utility.ReadProperties;

public class RentCarHour implements Rental {

    private Double fee;

    private Integer bikes;

    private Integer hours;

    private Integer costPerHour;

    public RentCarHour() {
        this.costPerHour = Integer.parseInt(file.getProperty("car.hour"));
    }

    @Override
    public boolean checkInfo() {
        // TODO Auto-generated method stub
        return false;
    }

    public void calculateFee(int bikes, int hours) {
        this.bikes = bikes;
        this.hours = hours;
        this.fee = this.bikes.doubleValue()*this.hours.doubleValue()*this.costPerHour.doubleValue();
    }

    @Override
    public Double getFee() {
        return this.fee;
    }

    public Integer getQty() {
        return this.bikes;
    }

    public Integer getHours() {
        return this.hours;
    }

    public Integer getCostPerHour() {
        return this.costPerHour;
    }

    @Override
    public String toString() {
        return new String("You will rent " + this.bikes + " bikes for " + this.hours + " hours for a total fee of " + this.fee);
    }
}