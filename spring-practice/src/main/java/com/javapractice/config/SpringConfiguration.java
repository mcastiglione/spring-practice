package com.javapractice.config;

import com.javapractice.Company;
import com.javapractice.model.Params;
import com.javapractice.model.Rental;
import com.javapractice.model.bike.RentBikeDay;
import com.javapractice.model.bike.RentBikeHour;
import com.javapractice.model.bike.RentBikeWeek;
import com.javapractice.model.car.RentCarDay;
import com.javapractice.model.car.RentCarHour;
import com.javapractice.model.car.RentCarWeek;
import com.javapractice.utility.RentFamily;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
@PropertySource("classpath:config.properties")
public class SpringConfiguration {

    @Bean
    @Scope("prototype")
    public RentBikeHour rentBikeHour(Params params) {
        return new RentBikeHour(params);
    }

    @Bean
    @Scope("prototype")
    public RentBikeHour rentBikeHour() {
        return new RentBikeHour();
    }

    @Bean
    @Scope("prototype")
    public RentBikeDay rentBikeDay(Params params) {
        return new RentBikeDay(params);
    }

    @Bean
    @Scope("prototype")
    public RentBikeDay rentBikeDay() {
        return new RentBikeDay();
    }


    @Bean
    @Scope("prototype")
    public RentBikeWeek rentBikeWeek(Params params) {
        return new RentBikeWeek(params);
    }

    @Bean
    @Scope("prototype")
    public RentBikeWeek rentBikeWeek() {
        return new RentBikeWeek();
    }

    @Bean
    @Scope("prototype")
    public Params params(int vehicles, int time) {
        return new Params(vehicles,time);
    }

    @Bean
    @Scope("prototype")
    public Params params() {
        return new Params();
    }

    @Bean
    @Scope("prototype")
    public RentCarHour rentCarHour(Params params) {
        return new RentCarHour(params);
    }

    @Bean
    @Scope("prototype")
    public RentCarHour rentCarHour() {
        return new RentCarHour();
    }

    @Bean
    @Scope("prototype")
    public RentCarDay rentCarDay(Params params) {
        return new RentCarDay(params);
    }

    @Bean
    @Scope("prototype")
    public RentCarDay rentCarDay() {
        return new RentCarDay();
    }


    @Bean
    @Scope("prototype")
    public RentCarWeek rentCarWeek(Params params) {
        return new RentCarWeek(params);
    }

    @Bean
    @Scope("prototype")
    public RentCarWeek rentCarWeek() {
        return new RentCarWeek();
    }

    @Bean
    @Scope("prototype")
    public RentFamily rentFamily(ArrayList<Rental> rentals) {
        return new RentFamily(rentals);
    }

    @Bean
    @Scope("prototype")
    public RentFamily rentFamily() {
        return new RentFamily();
    }

    @Bean
    @Scope("prototype")
    public Company company() {
        return new Company();
    }

}