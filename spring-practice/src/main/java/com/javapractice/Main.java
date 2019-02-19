package com.javapractice;

import com.javapractice.config.CompanyConfiguration;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CompanyConfiguration.class);

        Company company = ctx.getBean(Company.class);

        System.out.println(company.rentBikeHour(1,1));

        String[] rental1 = {"RentBikeHour", "4", "4"};
        String[] rental2 = {"RentCarWeek", "4", "1"};

        ArrayList<String[]> rentals = new ArrayList<String[]>();

        rentals.add(rental1);
        rentals.add(rental2);

        company.rentFamily(rentals);

    }
}
