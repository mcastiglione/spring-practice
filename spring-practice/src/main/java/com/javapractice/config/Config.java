package com.javapractice.config;

import com.javapractice.model.Rental;
import com.javapractice.model.bike.BikeParams;
import com.javapractice.model.bike.RentBikeDay;
import com.javapractice.model.bike.RentBikeHour;
import com.javapractice.model.bike.RentBikeWeek;
import com.javapractice.model.car.CarParams;
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
public class Config {

    @Bean
    @Scope("prototype")
    public RentBikeHour rentBikeHour(BikeParams bikeParams) {
        return new RentBikeHour(bikeParams);
    }

    @Bean
    @Scope("prototype")
    public RentBikeDay rentBikeDay(BikeParams bikeParams) {
        return new RentBikeDay(bikeParams);
    }

    @Bean
    @Scope("prototype")
    public RentBikeWeek rentBikeWeek(BikeParams bikeParams) {
        return new RentBikeWeek(bikeParams);
    }

    @Bean
    @Scope("prototype")
    public BikeParams bikeParams(int vehicles, int time) {
        return new BikeParams(vehicles,time);
    }


    @Bean
    @Scope("prototype")
    public RentCarHour rentCarHour(CarParams carParams) {
        return new RentCarHour(carParams);
    }

    @Bean
    @Scope("prototype")
    public RentCarDay rentCarDay(CarParams carParams) {
        return new RentCarDay(carParams);
    }

    @Bean
    @Scope("prototype")
    public RentCarWeek rentCarWeek(CarParams carParams) {
        return new RentCarWeek(carParams);
    }

    @Bean
    @Scope("prototype")
    public CarParams carParams(int vehicles, int time) {
        return new CarParams(vehicles,time);
    }

    @Bean
    @Scope("prototype")
    public RentFamily rentFamily(ArrayList<Rental> rentals) {
        return new RentFamily(rentals);
    }
}
