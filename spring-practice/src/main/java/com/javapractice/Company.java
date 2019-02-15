package com.javapractice;

import com.javapractice.config.Config;
import com.javapractice.model.FamilyRental;
import com.javapractice.model.Rental;
import com.javapractice.model.car.CarParams;
import com.javapractice.model.car.RentCarDay;
import com.javapractice.model.car.RentCarHour;
import com.javapractice.model.car.RentCarWeek;
import com.javapractice.utility.RentFamily;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javapractice.model.bike.RentBikeDay;
import com.javapractice.model.bike.RentBikeHour;
import com.javapractice.model.bike.RentBikeWeek;
import com.javapractice.model.bike.BikeParams;

import java.util.ArrayList;


public class Company {

    private static ArrayList<Rental> rentals;

    public static void main(String[] args) {

        //Application context

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        //bikeParams
        BikeParams bikeParams;

        //Case bike hour

        bikeParams = ctx.getBean(BikeParams.class, 1, 1);

        System.out.println(bikeParams.getVehicles());

        Rental rentBikeHour = ctx.getBean(RentBikeHour.class, bikeParams);
        rentBikeHour.calculateFee();

        System.out.print("<-- Rent bike hour: ");
        System.out.println(rentBikeHour.printData());
        System.out.println("-->");

        //Case bike day

        bikeParams = ctx.getBean(BikeParams.class, 1, 2);

        Rental rentBikeDay= ctx.getBean(RentBikeDay.class, bikeParams);
        rentBikeDay.calculateFee();

        System.out.print("<-- Rent bike day: ");
        System.out.println(rentBikeDay.printData());
        System.out.println("-->");

        //Case bike week

        bikeParams = ctx.getBean(BikeParams.class, 1, 1);
        Rental rentBikeWeek = ctx.getBean(RentBikeWeek.class, bikeParams);
        rentBikeWeek.calculateFee();

        System.out.print("<-- Rent bike week: ");
        System.out.println(rentBikeWeek.printData());
        System.out.println("-->");


        //Case bike family

        System.out.println("<-- Family rental bike: ");

        rentals = new ArrayList<Rental>();

        BikeParams bikeParamsFH = ctx.getBean(BikeParams.class, 1,3);
        Rental fRentalBikeHour = ctx.getBean(RentBikeHour.class, bikeParamsFH);
        fRentalBikeHour.calculateFee();

        BikeParams bikeParamsFD = ctx.getBean(BikeParams.class, 1,3);
        Rental fRentalBikeDay = ctx.getBean(RentBikeDay.class, bikeParamsFD);
        fRentalBikeDay.calculateFee();

        BikeParams bikeParamsFW = ctx.getBean(BikeParams.class, 1,3);
        Rental fRentalBikeWeek = ctx.getBean(RentBikeWeek.class, bikeParamsFW);
        fRentalBikeWeek.calculateFee();

        rentals.add(fRentalBikeHour);
        rentals.add(fRentalBikeDay);
        rentals.add(fRentalBikeWeek);

        FamilyRental fRental = ctx.getBean(RentFamily.class, rentals);

        fRental.calculateFee();

        fRental.printData();

        System.out.println("Fee:");
        System.out.println(fRental.getFee());
        System.out.println("Discount:");
        System.out.println(fRental.getDiscount());

        System.out.println("-->");

        //Car cases

        //Car Params

        CarParams carParams;

        //Case car hour

        carParams = ctx.getBean(CarParams.class, 1, 1);

        Rental rentCarHour = ctx.getBean(RentCarHour.class, carParams);
        rentCarHour.calculateFee();

        System.out.print("<-- Rent car hour: ");
        System.out.println(rentCarHour.printData());
        System.out.println("-->");

        //Case car day

        carParams = ctx.getBean(CarParams.class, 1, 2);

        Rental rentCarDay= ctx.getBean(RentCarDay.class, carParams);
        rentCarDay.calculateFee();

        System.out.print("<-- Rent car day: ");
        System.out.println(rentCarDay.printData());
        System.out.println("-->");

        //Case car week

        carParams = ctx.getBean(CarParams.class, 1, 1);
        Rental rentCarWeek = ctx.getBean(RentCarWeek.class, carParams);
        rentCarWeek.calculateFee();

        System.out.print("<-- Rent car week: ");
        System.out.println(rentCarWeek.printData());
        System.out.println("-->");


        //Case car family
        System.out.println("<-- Family rental car: ");

        rentals = new ArrayList<Rental>();

        CarParams carParamsFH = ctx.getBean(CarParams.class, 1,3);
        Rental fRentalCarHour = ctx.getBean(RentCarHour.class, carParamsFH);
        fRentalCarHour.calculateFee();

        CarParams carParamsFD = ctx.getBean(CarParams.class, 1,3);
        Rental fRentalCarDay = ctx.getBean(RentCarDay.class, carParamsFD);
        fRentalCarDay.calculateFee();

        CarParams carParamsFW = ctx.getBean(CarParams.class, 1,3);
        Rental fRentalCarWeek = ctx.getBean(RentCarWeek.class, carParamsFW);
        fRentalCarWeek.calculateFee();

        rentals.add(fRentalCarHour);
        rentals.add(fRentalCarDay);
        rentals.add(fRentalCarWeek);

        FamilyRental fRentalCar = ctx.getBean(RentFamily.class, rentals);

        fRental.calculateFee();

        fRental.printData();

        System.out.println("Fee:");
        System.out.println(fRental.getFee());
        System.out.println("Discount:");
        System.out.println(fRental.getDiscount());

        System.out.println("-->");


        //Family rental Mix

        System.out.println("<-- Family rental mix: ");

        rentals = new ArrayList<Rental>();

        BikeParams bikeParamsMix = ctx.getBean(BikeParams.class, 3,5);
        Rental fRentalBikeMix = ctx.getBean(RentBikeHour.class, bikeParamsMix);
        fRentalBikeMix.calculateFee();

        CarParams carParamsMix = ctx.getBean(CarParams.class, 1,4);
        Rental fRentalCarMix = ctx.getBean(RentCarWeek.class, carParamsMix);
        fRentalCarMix.calculateFee();

        rentals.add(fRentalBikeMix);
        rentals.add(fRentalCarMix);

        FamilyRental fRentalMix = ctx.getBean(RentFamily.class, rentals);

        fRentalMix.calculateFee();

        fRentalMix.printData();

        System.out.println("Fee:");
        System.out.println(fRentalMix.getFee());
        System.out.println("Discount:");
        System.out.println(fRentalMix.getDiscount());

        System.out.println("-->");
    }
}