package com.javapractice.model.bike;

import com.javapractice.model.Rental;
import com.javapractice.utility.ReadProperties;

public class RentBikeWeek implements Rental {

    private Double fee;

    private Integer bikes;

    private Integer weeks;

    private Integer costPerWeek;

    public RentBikeWeek() {
        this.costPerWeek = Integer.parseInt(file.getProperty("bike.week"));
    }

    @Override
    public boolean checkInfo() {
        // TODO Auto-generated method stub
        return false;
    }

    public void calculateFee(int bikes, int weeks) {
        this.bikes = bikes;
        this.weeks = weeks;
        this.fee = this.bikes.doubleValue()*this.weeks.doubleValue()*costPerWeek.doubleValue();
    }

    public Double getFee() {
        return this.fee;
    }

    public Integer getQty() {
        return this.bikes;
    }

    public Integer getWeeks() {
        return this.weeks;
    }

    public Integer getCostPerWeek() {
        return this.costPerWeek;
    }

    @Override
    public String toString() {
        return new String("You will rent " + this.bikes + " bikes for " + this.weeks + " weeks for a total fee of " + this.fee);
    }
}