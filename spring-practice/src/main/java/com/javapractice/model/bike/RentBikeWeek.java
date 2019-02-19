package com.javapractice.model.bike;

import com.javapractice.model.Params;
import com.javapractice.model.Rental;
import org.springframework.beans.factory.annotation.Value;

public class RentBikeWeek implements Rental {

    private Params params;

    @Value( "${bike.week}" )
    private Integer costPerTimeUnit;

    private Double fee;

    public RentBikeWeek(Params params) {
        this.params = params;
    }

    public RentBikeWeek() {
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public boolean isInfoOK() {
        return false;
    }

    public void calculateFee() {
        this.fee = this.params.getVehicles().doubleValue()*this.params.getTime().doubleValue()*this.costPerTimeUnit.doubleValue();
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
        return new String("You will rent " + this.params.getVehicles() + " bikes for " + this.params.getTime() + " weeks for a total fee of " + this.fee);
    }
}