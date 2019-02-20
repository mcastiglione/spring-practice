package com.javapractice.model;

public class Params {

    private Integer time;

    private String type;
    private Integer vehicles;

    public Params(int time, String type, int vehicles) {
        this.time = time;
        this.type = type;
        this.vehicles = vehicles;

    }

    public Params() {
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getVehicles() {
        return vehicles;
    }

    public void setVehicles(Integer vehicles) {
        this.vehicles = vehicles;
    }
}
