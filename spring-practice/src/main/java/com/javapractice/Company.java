package com.javapractice;

import com.javapractice.model.Params;
import com.javapractice.model.Rental;
import com.javapractice.model.bike.RentBikeDay;
import com.javapractice.model.bike.RentBikeHour;
import com.javapractice.model.bike.RentBikeWeek;
import com.javapractice.model.car.RentCarDay;
import com.javapractice.model.car.RentCarHour;
import com.javapractice.model.car.RentCarWeek;
import com.javapractice.utility.RentFamily;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {

    private ArrayList<Rental> rentals;

    Rental rental;

    @Autowired
    private Params params;

    @Autowired
    private RentFamily rentFamily;

    @Autowired
    private RentCarHour rentCarHour;

    @Autowired
    private RentCarDay rentCarDay;

    @Autowired
    private RentCarWeek rentCarWeek;

    @Autowired
    private RentBikeHour rentBikeHour;

    @Autowired
    private RentBikeDay rentBikeDay;

    @Autowired
    private RentBikeWeek rentBikeWeek;

    public Company() {
    }

    public String[] rentBikeHour(Integer time, Integer vehicles) {
        //Case bike hour

        params.setTime(time);
        params.setVehicles(vehicles);

        rentBikeHour.setParams(params);
        rentBikeHour.calculateFee();

        String[] result = {rentBikeHour.data(), rentBikeHour.getFee().toString(), time.toString(), vehicles.toString()};

        return result;
    }

    public String[] rentBikeDay(Integer time, Integer vehicles) {

        //Case bike day

        params.setTime(time);
        params.setVehicles(vehicles);

        rentBikeDay.setParams(params);
        rentBikeDay.calculateFee();

        String[] result = {rentBikeDay.data(), rentBikeDay.getFee().toString(), time.toString(), vehicles.toString()};

        return result;
    }

    public String[] rentBikeWeek(Integer time, Integer vehicles) {

        //Case bike week

        params.setTime(time);
        params.setVehicles(vehicles);

        rentBikeWeek.setParams(params);
        rentBikeWeek.calculateFee();

        String[] result = {rentBikeWeek.data(), rentBikeWeek.getFee().toString(), time.toString(), vehicles.toString()};

        return result;
    }

    public String[] rentCarHour(Integer time, Integer vehicles) {

        //Case car hour

        params.setTime(time);
        params.setVehicles(vehicles);

        rentCarHour.setParams(params);
        rentCarHour.calculateFee();

        String[] result = {rentCarHour.data(), rentCarHour.getFee().toString(), time.toString(), vehicles.toString()};

        return result;
    }

    public String[] rentCarDay(Integer time, Integer vehicles) {

        //Case car day

        params.setTime(time);
        params.setVehicles(vehicles);

        rentCarDay.setParams(params);
        rentCarDay.calculateFee();

        String[] result = {rentCarDay.data(), rentCarDay.getFee().toString(), time.toString(), vehicles.toString()};

        return result;
    }

    public String[] rentCarWeek(Integer time, Integer vehicles) {

        //Case car week

        params.setTime(time);
        params.setVehicles(vehicles);

        rentCarWeek.setParams(params);
        rentCarWeek.calculateFee();

        String[] result = {rentCarWeek.data(), rentCarWeek.getFee().toString(), time.toString(), vehicles.toString()};

        return result;
    }

    public String[] rentFamily(ArrayList<String[]> rentals) {

        String[] oRental = {};
        ArrayList<String[]> resultRentals = new ArrayList<String[]>();

        Iterator iter = rentals.iterator();

        while (iter.hasNext()) {
            String[] iRental = (String[]) iter.next();
            switch (iRental[0]) {
                case "RentBikeHour":
                    oRental = rentBikeHour(Integer.parseInt(iRental[1]), Integer.parseInt(iRental[2]));
                    resultRentals.add(oRental);
                    break;
                case "RentBikeDay":
                    oRental = rentBikeDay(Integer.parseInt(iRental[1]), Integer.parseInt(iRental[2]));
                    resultRentals.add(oRental);
                    break;
                case "RentBikeWeek":
                    oRental = rentBikeWeek(Integer.parseInt(iRental[1]), Integer.parseInt(iRental[2]));
                    resultRentals.add(oRental);
                    break;
                case "RentCarHour":
                    oRental = rentCarHour(Integer.parseInt(iRental[1]), Integer.parseInt(iRental[2]));
                    resultRentals.add(oRental);
                    break;
                case "RentCarDay":
                    oRental = rentCarDay(Integer.parseInt(iRental[1]), Integer.parseInt(iRental[2]));
                    resultRentals.add(oRental);
                    break;
                case "RentCarWeek":
                    oRental = rentCarWeek(Integer.parseInt(iRental[1]), Integer.parseInt(iRental[2]));
                    resultRentals.add(oRental);
                    break;
            }
        }

        rentFamily.setRentals(resultRentals);

        rentFamily.calculateFee();

        String[] oData = {rentFamily.data(), rentFamily.getFee().toString()};

        return oData;
    }
}