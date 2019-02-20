package com.javapractice;

import com.google.gson.Gson;
import com.javapractice.model.Params;
import com.javapractice.model.ParamsArr;
import com.javapractice.model.Rental;
import com.javapractice.model.bike.RentBikeDay;
import com.javapractice.model.bike.RentBikeHour;
import com.javapractice.model.bike.RentBikeWeek;
import com.javapractice.model.car.RentCarDay;
import com.javapractice.model.car.RentCarHour;
import com.javapractice.model.car.RentCarWeek;
import com.javapractice.utility.RentFamily;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@SpringBootApplication
public class Company {

    private ArrayList<Rental> rentals;

    Rental rental;

    @Autowired
    private Gson gson;

    @Autowired
    private Params params;

    @Autowired
    private ParamsArr paramsArr;


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

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/Rental", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String Rental(@RequestBody String payload) {

        params = gson.fromJson(payload, Params.class);

        String type = params.getType();

        switch (type) {
            case "RentBikeHour":
                rentBikeHour.setParams(params);
                rentBikeHour.calculateFee();
                return gson.toJson(rentBikeHour);

            case "RentBikeDay":
                rentBikeDay.setParams(params);
                rentBikeDay.calculateFee();
                return gson.toJson(rentBikeDay);

            case "RentBikeWeek":
                rentBikeWeek.setParams(params);
                rentBikeWeek.calculateFee();
                return gson.toJson(rentBikeWeek);

            case "RentCarHour":
                rentCarHour.setParams(params);
                rentCarHour.calculateFee();
                return gson.toJson(rentCarHour);

            case "RentCarDay":
                rentCarDay.setParams(params);
                rentCarDay.calculateFee();
                return gson.toJson(rentCarDay);

            case "RentCarWeek":
                rentCarWeek.setParams(params);
                rentCarWeek.calculateFee();
                return gson.toJson(rentCarWeek);

            default:
                return new String("{}");

        }
    }


    @RequestMapping(value = "/RentalFamily", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String RentalFamily(@RequestBody String payload) {

        paramsArr = gson.fromJson(payload, ParamsArr.class);

        rentFamily.setRentals(paramsArr);
        rentFamily.process();

        return gson.toJson(rentFamily);
    }

    public static void main(String[] args) {
        SpringApplication.run(Company.class, args);
    }
}