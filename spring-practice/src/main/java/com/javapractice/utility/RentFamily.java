package com.javapractice.utility;

import com.javapractice.model.FamilyRental;
import com.javapractice.model.bike.RentBikeDay;
import com.javapractice.model.bike.RentBikeHour;
import com.javapractice.model.bike.RentBikeWeek;
import com.javapractice.model.car.RentCarDay;
import com.javapractice.model.car.RentCarHour;
import com.javapractice.model.car.RentCarWeek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class RentFamily implements FamilyRental {

    private Double fee = 0.0;

    @Autowired
    private transient RentCarHour rentCarHour;

    @Autowired
    private transient RentCarDay rentCarDay;

    @Autowired
    private transient RentCarWeek rentCarWeek;

    @Autowired
    private transient RentBikeHour rentBikeHour;

    @Autowired
    private transient RentBikeDay rentBikeDay;

    @Autowired
    private transient RentBikeWeek rentBikeWeek;

    private transient Map<String,String> rentalData;

    private ArrayList<String[]> rentals;

    @Value("${family.discount}")
    private Integer discount;

    private Integer Qty = 0;

    private ArrayList<String> data;

    private String time;
    private String vehicles;
    private String type;

    public RentFamily(Map<String, String> rentalData) {
        this.rentalData = rentalData;
    }

    public RentFamily() {
    }

    public void setRentals(Map<String, String> rentalData) {
        this.rentalData = rentalData;
    }

    public boolean checkInfo() {
        this.rentals.stream().forEach(y -> this.Qty += Integer.parseInt(y[1]));
        return Qty <= 5 && Qty >= 3;
    }

    public void MapToArray() {
        rentals = new ArrayList<String[]>();
        for (int c = 1; c < 6; c++) {
            time = rentalData.get("time" + c);
            vehicles = rentalData.get("vehicles" + c);
            type = rentalData.get("type" + c);

            System.out.print(time + '\n');
            System.out.print(vehicles + '\n');
            System.out.print(type + '\n');

            String[] rental = {time, vehicles, type};

            System.out.println(rental);

            if (time != null && vehicles != null && type != null) {
                rentals.add(rental);
            }
        }
    }

    public void process() {

        this.fee = 0.0;
        this.Qty = 0;
        data = new ArrayList<String>();
        String[] rental;
        Iterator iter = this.rentals.iterator();

        while (iter.hasNext()) {
            rental = (String[])iter.next();

            Integer time = Integer.parseInt(rental[0]);
            Integer vehicles = Integer.parseInt(rental[1]);
            String type = rental[2];

            switch (type) {
                case "RentBikeHour":
                    rentBikeHour.setTime(time);
                    rentBikeHour.setVehicles(vehicles);
                    rentBikeHour.calculateFee();
                    data.add(rentBikeHour.data());
                    this.fee += rentBikeHour.getFee();
                    this.Qty += rentBikeHour.getQty();
                    break;
                case "RentBikeDay":
                    rentBikeDay.setTime(time);
                    rentBikeDay.setVehicles(vehicles);
                    rentBikeDay.calculateFee();
                    data.add(rentBikeDay.data());
                    this.fee += rentBikeDay.getFee();
                    this.Qty += rentBikeDay.getQty();
                    break;
                case "RentBikeWeek":
                    rentBikeWeek.setTime(time);
                    rentBikeWeek.setVehicles(vehicles);
                    rentBikeWeek.calculateFee();
                    data.add(rentBikeWeek.data());
                    this.fee += rentBikeWeek.getFee();
                    this.Qty += rentBikeWeek.getQty();
                    break;
                case "RentCarHour":
                    rentCarHour.setTime(time);
                    rentCarHour.setVehicles(vehicles);
                    rentCarHour.calculateFee();
                    data.add(rentCarHour.data());
                    this.fee += rentCarHour.getFee();
                    this.Qty += rentCarHour.getQty();
                    break;
                case "RentCarDay":
                    rentCarDay.setTime(time);
                    rentCarDay.setVehicles(vehicles);
                    rentCarDay.calculateFee();
                    data.add(rentCarDay.data());
                    this.fee += rentCarDay.getFee();
                    this.Qty += rentCarDay.getQty();
                    break;
                case "RentCarWeek":
                    rentCarWeek.setTime(time);
                    rentCarWeek.setVehicles(vehicles);
                    rentCarWeek.calculateFee();
                    data.add(rentCarWeek.data());
                    this.fee += rentCarWeek.getFee();
                    this.Qty += rentCarWeek.getQty();
                    break;
                default:
                    break;
            }
        }

        this.fee = this.fee - (this.fee / 100 * this.discount.doubleValue());
    }

    public void logValues() {

    }

    public Double getFee() {
        return this.fee;
    }

    public Integer getQty() {
        return this.Qty;
    }

    public String data() {
        return data.toString();
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getDiscount() {
        return discount;
    }
}