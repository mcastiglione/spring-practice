package com.javapractice.utility;

import com.javapractice.model.Rental;
import com.javapractice.model.bike.RentBikeDay;
import com.javapractice.model.bike.RentBikeHour;
import com.javapractice.model.bike.RentBikeWeek;
import com.javapractice.model.car.RentCarDay;
import com.javapractice.model.car.RentCarHour;
import com.javapractice.model.car.RentCarWeek;

public class RentalFactory {

    private Rental rental;

    public RentalFactory() {

    }

    public Rental getRental(String vehicleType, String timeUnit) {
        switch(vehicleType) {
            case "car":
                switch(timeUnit) {
                    case "hour":
                        rental = new RentCarHour();
                        break;
                    case "day":
                        rental = new RentCarDay();
                        break;
                    case "week":
                        rental = new RentCarWeek();
                        break;
                }
                break;
            case "bike":
                switch(timeUnit) {
                    case "hour":
                        rental = new RentBikeHour();
                        break;
                    case "day":
                        rental = new RentBikeDay();
                        break;
                    case "week":
                        rental = new RentBikeWeek();
                        break;
                }
        }
    return rental;
    }
}
