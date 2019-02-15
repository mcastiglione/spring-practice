package com.javapractice.model.car;

import com.javapractice.model.Rental;
import org.springframework.beans.factory.annotation.Value;

public class RentCarHour implements Rental {

    private CarParams carParams;

    @Value( "${car.hour}" )
    private Integer costPerTimeUnit;

    private Double fee;

    public RentCarHour(CarParams carParams) {
        this.carParams = carParams;
    }

    public RentCarHour() {
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
        return new String("You will rent " + this.carParams.getVehicles() + " cars for " + this.carParams.getTime() + " hours for a total fee of " + this.fee);
    }
}