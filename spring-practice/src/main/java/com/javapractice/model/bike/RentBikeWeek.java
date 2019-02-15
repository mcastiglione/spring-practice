package com.javapractice.model.bike;

import com.javapractice.model.Rental;
import org.springframework.beans.factory.annotation.Value;

public class RentBikeWeek implements Rental {

    private BikeParams bikeParams;

    @Value( "${bike.week}" )
    private Integer costPerTimeUnit;

    private Double fee;

    public RentBikeWeek(BikeParams bikeParams) {
        this.bikeParams = bikeParams;
    }

    public RentBikeWeek() {
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
        return new String("You will rent " + this.bikeParams.getVehicles() + " bikes for " + this.bikeParams.getTime() + " weeks for a total fee of " + this.fee);
    }
}