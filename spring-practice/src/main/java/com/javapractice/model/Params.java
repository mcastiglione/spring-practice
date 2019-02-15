package com.javapractice.model;

public class Params  {

    private Integer vehicles;
    private Integer time;

    public Params(int vehicles, int time) {
        this.vehicles = vehicles;
        this.time = time;
    }

    public Params() {
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
