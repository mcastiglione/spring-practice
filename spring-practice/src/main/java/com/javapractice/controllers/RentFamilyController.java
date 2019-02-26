package com.javapractice.controllers;

import com.google.gson.Gson;
import com.javapractice.utility.RentFamily;
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
public class RentFamilyController {

    @Autowired
    Gson gson;

    @Autowired
    RentFamily rentFamily;

    @RequestMapping(value = "/RentalFamily", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity RentalFamily(@RequestParam Map<String, String> allRequestParams) {

        rentFamily.setRentals(allRequestParams);
        rentFamily.MapToArray();
        rentFamily.process();

        return new ResponseEntity(gson.toJson(rentFamily), HttpStatus.OK);
    }

}
