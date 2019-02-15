package com.javapractice.model.bike;

import com.javapractice.model.Rental;

public class RentBikeHour implements Rental {

    private BikeParams bikeParams;

    private Integer costPerTimeUnit;

    private Double fee;

    public RentBikeHour(BikeParams bikeParams) {
        this.bikeParams = bikeParams;
    }

    public RentBikeHour() {
    }

    public boolean isInfoOK() {
        return false;
    }

    public void calculateFee() {
        this.fee = this.bikeParams.getVehicles().doubleValue()*this.bikeParams.getTime().doubleValue()*this.costPerTimeUnit.doubleValue();
    }

    public void logValues() {
        System.out.println("not implemented");
    }

    public Double getFee() {
        return this.fee;
    }

    public Integer getQty() {
        return this.bikeParams.getVehicles();
    }

    public void setCostPerTimeUnit(Integer costPerTimeUnit) {
        this.costPerTimeUnit = costPerTimeUnit;
    }

    public String printData() {
        return new String("You will rent " + this.bikeParams.getVehicles() + " bikes for " + this.bikeParams.getTime() + " hours for a total fee of " + this.fee);
    }
}