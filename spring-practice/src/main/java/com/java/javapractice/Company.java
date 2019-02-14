package com.java.javapractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.javapractice.model.bike.RentBikeDay;

public class Company {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        RentBikeDay rentBikeDay= ctx.getBean(RentBikeDay.class);
        System.out.println(rentBikeDay);


    }
}