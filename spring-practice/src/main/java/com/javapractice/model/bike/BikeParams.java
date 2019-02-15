package com.javapractice.model.bike;

public class BikeParams {

    private Integer vehicles;
    private Integer time;

    public BikeParams(int vehicles, int time) {
        this.vehicles = vehicles;
        this.time = time;
    }

    public BikeParams() {
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
