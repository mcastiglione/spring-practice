package com.javapractice.model.car;

import com.javapractice.model.Rental;

public class RentCarWeek implements Rental {

    private CarParams carParams;

    private Integer costPerTimeUnit;

    private Double fee;

    public RentCarWeek(CarParams carParams) {
        this.carParams = carParams;
    }

    public RentCarWeek() {
    }

    public boolean isInfoOK() {
        return false;
    }

    public void calculateFee() {
        this.fee = this.carParams.getVehicles().doubleValue()*this.carParams.getTime().doubleValue()*this.costPerTimeUnit;
    }

    public void logValues() {
        System.out.println("not implemented");
    }

    public Double getFee() {
        return this.fee;
    }

    public Integer getQty() {
        return this.carParams.getVehicles();
    }

    public void setCostPerTimeUnit(Integer costPerTimeUnit) {
        this.costPerTimeUnit = costPerTimeUnit;
    }

    public String printData() {
        return new String("You will rent " + this.carParams.getVehicles() + " cars for " + this.carParams.getTime() + " weeks for a total fee of " + this.fee);
    }
}