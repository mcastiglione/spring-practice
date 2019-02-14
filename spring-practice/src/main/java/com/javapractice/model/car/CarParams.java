package com.javapractice.model.car;

public class CarParams {

    private Double fee;
    private Integer vehicles;
    private Integer time;
    private Integer costPerTimeUnit;
    private String timeUnit;

    public CarParams(int vehicles, int time, int costPerTimeUnit, String timeUnit) {
        this.vehicles = vehicles;
        this.time = time;
        this.costPerTimeUnit = costPerTimeUnit;
        this.timeUnit = timeUnit;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }
}
