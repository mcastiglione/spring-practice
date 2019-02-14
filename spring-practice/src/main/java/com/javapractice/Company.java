package com.javapractice;

import com.javapractice.model.Rental;
import com.javapractice.model.FamilyRental;
import com.javapractice.utility.RentalFactory;
import com.javapractice.utility.RentFamily;

import java.util.ArrayList;

import org.apache.log4j.Logger;


public class Company {
    private static Rental rental;
    private static FamilyRental fRental;
    private static ArrayList<Rental> rentals;
    private static RentalFactory rentalFactory;

    final static Logger logger = Logger.getLogger(Company.class);

    public static void main(String[] args) {

        //DbReader dbReader = DbReader.getInstance();

        rentalFactory = new RentalFactory();

        //Case hour
        rental = rentalFactory.getRental("bike", "hour");
        rental.calculateFee(1,1);
        logger.info(rental);

        //Case day
        rental = rentalFactory.getRental("bike", "day");
        rental.calculateFee(1,2);
        logger.info(rental);

        //Case week
        rental = rentalFactory.getRental( "bike", "week");
        rental.calculateFee(1,1);
        logger.info(rental);

        //Case family
        rentals = new ArrayList<Rental>();

        System.out.println("BEGIN family rental rentals");

        Rental fRentalHour = rentalFactory.getRental("car", "hour");
        fRentalHour.calculateFee(1,3);
        logger.info(fRentalHour);


        Rental fRentalDay = rentalFactory.getRental("bike", "day");
        fRentalDay.calculateFee(1,5);
        logger.info(fRentalDay);

        Rental fRentalWeek = rentalFactory.getRental("car", "week");
        fRentalWeek.calculateFee(2,10);
        logger.info(fRentalWeek);

        rentals.add(fRentalHour);
        rentals.add(fRentalDay);
        rentals.add(fRentalWeek);

        int discount = 30;
        logger.info("Family discount: " + discount + "%");
        fRental = new RentFamily();
        fRental.calculateFee(rentals, discount);

        logger.info(fRental);

    }
}