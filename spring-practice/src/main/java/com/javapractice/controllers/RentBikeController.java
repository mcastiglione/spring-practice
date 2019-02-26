package com.javapractice.controllers;

import com.google.gson.Gson;
import com.javapractice.model.bike.RentBikeDay;
import com.javapractice.model.bike.RentBikeHour;
import com.javapractice.model.bike.RentBikeWeek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class RentBikeController {

    @Autowired
    private Gson gson;

    @Autowired
    private RentBikeHour rentBikeHour;

    @Autowired
    private RentBikeDay rentBikeDay;

    @Autowired
    private RentBikeWeek rentBikeWeek;


    @RequestMapping(value = "/RentalBike", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity Rental(@RequestParam Map<String, String> allRequestParams) {

        String type = allRequestParams.get("type");
        Integer time = Integer.parseInt(allRequestParams.get("time"));
        Integer vehicles = Integer.parseInt(allRequestParams.get("vehicles"));

        switch (type) {
            case "RentBikeHour":
                rentBikeHour.setTime(time);
                rentBikeHour.setVehicles(vehicles);
                rentBikeHour.calculateFee();
                return new ResponseEntity(gson.toJson(rentBikeHour), HttpStatus.OK);

            case "RentBikeDay":
                rentBikeDay.setTime(time);
                rentBikeDay.setVehicles(vehicles);
                rentBikeDay.calculateFee();
                return new ResponseEntity(gson.toJson(rentBikeDay), HttpStatus.OK);

            case "RentBikeWeek":
                rentBikeWeek.setTime(time);
                rentBikeWeek.setVehicles(vehicles);
                rentBikeWeek.calculateFee();
                return new ResponseEntity(gson.toJson(rentBikeWeek), HttpStatus.OK);

            default:
                return new ResponseEntity("{}", HttpStatus.NOT_FOUND);
        }
    }

}
