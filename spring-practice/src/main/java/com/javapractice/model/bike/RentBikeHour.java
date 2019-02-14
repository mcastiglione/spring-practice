package com.javapractice.model.bike;

import com.javapractice.model.Rental;

public class RentBikeHour implements Rental {

    private BikeParams bikeParams;

    public RentBikeHour(BikeParams bikeParams) {
        this.bikeParams = bikeParams;
    }

    public boolean isInfoOK() {
        return false;
    }

    public void calculateFee() {
        Double fee = this.bikeParams.getVehicles().doubleValue()*this.bikeParams.getTime().doubleValue()*this.bikeParams.getCostPerTimeUnit().doubleValue();
        this.bikeParams.setFee(fee);
    }

    public void logValues() {
        System.out.println("not implemented");
    }

    public Double getFee() {
        return this.bikeParams.getFee();
    }

    public Integer getQty() {
        return this.bikeParams.getVehicles();
    }
}