package com.javapractice;

import com.javapractice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Company company = ctx.getBean(Company.class);


        System.out.println(company.toString());

        company.run();

    }
}
