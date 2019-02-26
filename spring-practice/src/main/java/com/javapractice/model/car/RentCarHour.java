package com.javapractice.model.car;

import com.javapractice.model.Rental;
import org.springframework.beans.factory.annotation.Value;

public class RentCarHour implements Rental {

    @Value("${car.hour}")
    private Integer costPerTimeUnit;

    private Integer time;

    private Integer vehicles;

    private Double fee;

    public RentCarHour() {
    }

    public boolean isInfoOK() {
        return false;
    }

    public void calculateFee() {
        this.fee = this.vehicles.doubleValue() * this.time.doubleValue() * this.costPerTimeUnit;
    }

    public void logValues() {
    }

    public Double getFee() {
        return this.fee;
    }

    public Integer getQty() {
        return this.vehicles;
    }

    public void setCostPerTimeUnit(Integer costPerTimeUnit) {
        this.costPerTimeUnit = costPerTimeUnit;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getVehicles() {
        return vehicles;
    }

    public void setVehicles(Integer vehicles) {
        this.vehicles = vehicles;
    }

    public String data() {
        return "You will rent " + this.vehicles + " cars for " + this.time + " hours for a total fee of " + this.fee;
    }
}