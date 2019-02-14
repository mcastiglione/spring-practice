package com.javapractice.model.bike;

import com.javapractice.model.Rental;

public class RentBikeWeek implements Rental {

    private BikeParams bikeParams;

    public RentBikeWeek(BikeParams bikeParams) {
        this.bikeParams = bikeParams;
        this.bikeParams.setCostPerTimeUnit(Integer.parseInt(file.getProperty("bike.week")));
    }

    public RentBikeWeek() {
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

    public String showData() {
        return new String("You will rent " + this.bikeParams.getVehicles() + " bikes for " + this.bikeParams.getTime() + " weeks for a total fee of " + this.bikeParams.getFee());
    }
}