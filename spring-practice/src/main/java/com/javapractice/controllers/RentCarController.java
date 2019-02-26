package com.javapractice.controllers;

import com.google.gson.Gson;
import com.javapractice.model.car.RentCarDay;
import com.javapractice.model.car.RentCarHour;
import com.javapractice.model.car.RentCarWeek;
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
public class RentCarController {

    @Autowired
    private Gson gson;

    @Autowired
    private RentCarHour rentCarHour;

    @Autowired
    private RentCarDay rentCarDay;

    @Autowired
    private RentCarWeek rentCarWeek;

    @RequestMapping(value = "/RentalCar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity Rental(@RequestParam Map<String, String> allRequestParams) {

        String type = allRequestParams.get("type");
        Integer time = Integer.parseInt(allRequestParams.get("time"));
        Integer vehicles = Integer.parseInt(allRequestParams.get("vehicles"));

        switch (type) {
            case "RentCarHour":
                rentCarHour.setTime(time);
                rentCarHour.setVehicles(vehicles);
                rentCarHour.calculateFee();
                return new ResponseEntity(gson.toJson(rentCarHour), HttpStatus.OK);

            case "RentCarDay":
                rentCarDay.setTime(time);
                rentCarDay.setVehicles(vehicles);
                rentCarDay.calculateFee();
                return new ResponseEntity(gson.toJson(rentCarDay), HttpStatus.OK);

            case "RentCarWeek":
                rentCarWeek.setTime(time);
                rentCarWeek.setVehicles(vehicles);
                rentCarWeek.calculateFee();
                return new ResponseEntity(gson.toJson(rentCarWeek), HttpStatus.OK);

            default:
                return new ResponseEntity("{}", HttpStatus.NOT_FOUND);
        }
    }

}
