package com.javapractice.configuration;

import com.google.gson.Gson;
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

@Configuration
@PropertySource("classpath:config.properties")
public class CompanyConfiguration {

    @Bean
    public RentBikeHour rentBikeHour() {
        return new RentBikeHour();
    }

    @Bean
    public RentBikeDay rentBikeDay() {
        return new RentBikeDay();
    }

    @Bean
    public RentBikeWeek rentBikeWeek() {
        return new RentBikeWeek();
    }

    @Bean
    public RentCarHour rentCarHour() {
        return new RentCarHour();
    }

    @Bean
    public RentCarDay rentCarDay() {
        return new RentCarDay();
    }

    @Bean
    public RentCarWeek rentCarWeek() {
        return new RentCarWeek();
    }

    @Bean
    public RentFamily rentFamily() {
        return new RentFamily();
    }

    @Bean
    public Gson gson() {
        return new Gson();
    }

}