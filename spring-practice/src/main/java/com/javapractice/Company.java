package com.javapractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javapractice.model.bike.RentBikeDay;
import com.javapractice.model.bike.RentBikeHour;
import com.javapractice.model.bike.RentBikeWeek;
import com.javapractice.model.bike.BikeParams;


public class Company {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

        BikeParams bikeParams;

        bikeParams = (BikeParams)ctx.getBean(BikeParams.class, 1, 1, "day");

        System.out.println(bikeParams.getTime());

        RentBikeDay rentBikeDay= (RentBikeDay)ctx.getBean(RentBikeDay.class, bikeParams);

        rentBikeDay.calculateFee();

        System.out.println(rentBikeDay.showData());

    }
}