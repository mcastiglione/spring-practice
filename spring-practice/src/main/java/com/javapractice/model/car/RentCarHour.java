package com.javapractice.model.car;

import com.javapractice.model.Params;
import com.javapractice.model.Rental;
import org.springframework.beans.factory.annotation.Value;

public class RentCarHour implements Rental {

    private Params params;

    @Value("${car.hour}")
    private Integer costPerTimeUnit;

    private Double fee;

    public RentCarHour(Params params) {
        this.params = params;
    }

    public RentCarHour() {
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public boolean isInfoOK() {
        return false;
    }

    public void calculateFee() {
        this.fee = this.params.getVehicles().doubleValue() * this.params.getTime().doubleValue() * this.costPerTimeUnit;
    }

    public void logValues() {
    }

    public Double getFee() {
        return this.fee;
    }

    public Integer getQty() {
        return this.params.getVehicles();
    }

    public void setCostPerTimeUnit(Integer costPerTimeUnit) {
        this.costPerTimeUnit = costPerTimeUnit;
    }

    public String data() {
        return "You will rent " + this.params.getVehicles() + " cars for " + this.params.getTime() + " hours for a total fee of " + this.fee;
    }
}