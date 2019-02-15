package com.javapractice;

import com.javapractice.model.Params;
import com.javapractice.model.Rental;
import com.javapractice.model.car.RentCarDay;
import com.javapractice.model.car.RentCarHour;
import com.javapractice.model.car.RentCarWeek;
import com.javapractice.utility.RentFamily;
import org.springframework.beans.factory.annotation.Autowired;

import com.javapractice.model.bike.RentBikeDay;
import com.javapractice.model.bike.RentBikeHour;
import com.javapractice.model.bike.RentBikeWeek;

import java.util.ArrayList;


public class Company {

    private static ArrayList<Rental> rentals;

    public Company() {
    }

    @Autowired
    private Params params;

    @Autowired
    private Params paramsF1;
    @Autowired
    private Params paramsF2;
    @Autowired
    private Params paramsF3;

    @Autowired
    private RentFamily rentFamily1;

    @Autowired
    private RentFamily rentFamily2;

    @Autowired
    private RentFamily rentFamily3;

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

    @Autowired
    private RentCarHour fRentCarHour;

    @Autowired
    private RentCarDay fRentCarDay;

    @Autowired
    private RentCarWeek fRentCarWeek;

    @Autowired
    private RentBikeHour fMixRentBikeHour;

    @Autowired
    private RentCarWeek fMixRentCarWeek;




    public void test() {
        System.out.println("out!");
        params.setTime(1);
        System.out.println(params.getTime());
    }

    public void run() {

        //Case bike hour

        params.setTime(1);
        params.setVehicles(1);

        rentBikeHour.setParams(params);

        rentBikeHour.calculateFee();

        System.out.print("<-- Rent bike hour: ");
        System.out.println(rentBikeHour.printData());
        System.out.println("-->");


        //Case bike day

        params.setTime(1);
        params.setVehicles(2);

        rentBikeDay.setParams(params);
        rentBikeDay.calculateFee();

        System.out.print("<-- Rent bike day: ");
        System.out.println(rentBikeDay.printData());
        System.out.println("-->");

        //Case bike week

        params.setTime(1);
        params.setVehicles(1);

        rentBikeWeek.setParams(params);
        rentBikeWeek.calculateFee();

        System.out.print("<-- Rent bike week: ");
        System.out.println(rentBikeWeek.printData());
        System.out.println("-->");

        //Case bike family

        System.out.println("<-- Family rental bike: ");

        rentals = new ArrayList<Rental>();

        paramsF1.setTime(1);
        paramsF1.setVehicles(3);
        rentBikeHour.setParams(paramsF1);
        rentBikeHour.calculateFee();

        paramsF2.setTime(1);
        paramsF2.setVehicles(3);
        rentBikeDay.setParams(paramsF2);
        rentBikeDay.calculateFee();

        paramsF3.setTime(1);
        paramsF3.setVehicles(3);
        rentBikeWeek.setParams(paramsF3);
        rentBikeWeek.calculateFee();


        rentals.add(rentBikeHour);
        rentals.add(rentBikeDay);
        rentals.add(rentBikeWeek);

        rentFamily1.setRentals(rentals);

        rentFamily1.calculateFee();

        rentFamily1.printData();

        System.out.println("Fee:");
        System.out.println(rentFamily1.getFee());
        System.out.println("Discount:");
        System.out.println(rentFamily1.getDiscount());

        System.out.println("-->");

        //Car cases

        //Case car hour

        params.setTime(1);
        params.setVehicles(1);

        rentCarHour.setParams(params);
        rentCarHour.calculateFee();

        System.out.print("<-- Rent car hour: ");
        System.out.println(rentCarHour.printData());
        System.out.println("-->");

        //Case car day

        params.setTime(1);
        params.setVehicles(2);

        rentCarDay.setParams(params);
        rentCarDay.calculateFee();

        System.out.print("<-- Rent car day: ");
        System.out.println(rentCarDay.printData());
        System.out.println("-->");

        //Case car week

        params.setTime(1);
        params.setVehicles(1);
        rentCarWeek.setParams(params);
        rentCarWeek.calculateFee();

        System.out.print("<-- Rent car week: ");
        System.out.println(rentCarWeek.printData());
        System.out.println("-->");

        //Case car family
        System.out.println("<-- Family rental car: ");

        rentals = new ArrayList<Rental>();

        paramsF1.setTime(1);
        paramsF1.setVehicles(3);
        fRentCarHour.setParams(paramsF1);
        fRentCarHour.calculateFee();

        paramsF2.setTime(1);
        paramsF2.setVehicles(3);
        fRentCarDay.setParams(paramsF2);
        fRentCarDay.calculateFee();

        paramsF3.setTime(1);
        paramsF3.setVehicles(3);
        fRentCarWeek.setParams(paramsF3);
        fRentCarWeek.calculateFee();

        rentals.add(fRentCarHour);
        rentals.add(fRentCarDay);
        rentals.add(fRentCarWeek);

        rentFamily2.setRentals(rentals);

        rentFamily2.calculateFee();

        rentFamily2.printData();

        System.out.println("Fee:");
        System.out.println(rentFamily2.getFee());
        System.out.println("Discount:");
        System.out.println(rentFamily2.getDiscount());

        System.out.println("-->");

        //Family rental Mix

        System.out.println("<-- Family rental mix: ");

        rentals = new ArrayList<Rental>();

        paramsF1.setTime(3);
        paramsF1.setVehicles(5);
        fMixRentBikeHour.setParams(paramsF1);
        fMixRentBikeHour.calculateFee();

        paramsF2.setTime(1);
        paramsF2.setVehicles(4);
        fMixRentCarWeek.setParams(paramsF2);
        fMixRentCarWeek.calculateFee();


        rentals.add(fMixRentBikeHour);
        rentals.add(fMixRentCarWeek);

        rentFamily3.setRentals(rentals);

        rentFamily3.calculateFee();

        rentFamily3.printData();

        System.out.println("Fee:");
        System.out.println(rentFamily3.getFee());
        System.out.println("Discount:");
        System.out.println(rentFamily3.getDiscount());

        System.out.println("-->");
    }

    public static void main(String[] args) {


    }
}