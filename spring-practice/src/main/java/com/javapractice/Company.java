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

        BikeParams bikeParams = (BikeParams)ctx.getBean(BikeParams.class, 1, 1, 1, "car");

        System.out.println(bikeParams.getTimeUnit());

        RentBikeDay rentBikeDay= (RentBikeDay)ctx.getBean(RentBikeDay.class, bikeParams);

        System.out.println(rentBikeDay);


    }
}