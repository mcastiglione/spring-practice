package com.javapractice.model.car;

public class CarParams {

    private Integer vehicles;
    private Integer time;

    public CarParams(int vehicles, int time) {
        this.vehicles = vehicles;
        this.time = time;
    }

    public CarParams() {
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
}
