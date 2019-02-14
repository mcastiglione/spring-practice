package com.javapractice.model.bike;

public class BikeParams {

    private Double fee;

    private Integer vehicles;
    private Integer time;
    private Integer costPerTimeUnit;
    private String timeUnit;

    public BikeParams(int vehicles, int time, String timeUnit) {
        System.out.println("bp!");
        this.vehicles = vehicles;
        this.time = time;
        this.timeUnit = timeUnit;
    }

    public BikeParams() {
        System.out.println("bpd!");
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Double getFee() {
        return fee;
    }

    public Integer getVehicles() {
        return vehicles;
    }

    public void setVehicles(Integer vehicles) {
        this.vehicles = vehicles;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getCostPerTimeUnit() {
        return costPerTimeUnit;
    }

    public void setCostPerTimeUnit(Integer costPerTimeUnit) {
        this.costPerTimeUnit = costPerTimeUnit;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

}
