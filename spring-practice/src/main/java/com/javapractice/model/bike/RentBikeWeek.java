package com.javapractice.model.bike;

import com.javapractice.model.Rental;
import org.springframework.beans.factory.annotation.Value;

public class RentBikeWeek implements Rental {

    @Value("${bike.week}")
    private Integer costPerTimeUnit;

    private Integer time;

    private Integer vehicles;

    private Double fee;

    public RentBikeWeek() {
    }

    public boolean isInfoOK() {
        return false;
    }

    public void calculateFee() {
        this.fee = this.vehicles.doubleValue() * this.time.doubleValue() * this.costPerTimeUnit.doubleValue();
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
        return "You will rent " + this.vehicles + " bikes for " + this.time + " weeks for a total fee of " + this.fee;
    }
}