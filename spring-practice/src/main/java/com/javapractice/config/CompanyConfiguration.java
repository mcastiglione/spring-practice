package com.javapractice.config;

import com.javapractice.Company;
import com.javapractice.model.Params;
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

@Configuration
@PropertySource("classpath:config.properties")
public class CompanyConfiguration {

    @Bean
    @Scope("prototype")
    public RentBikeHour rentBikeHour() {
        return new RentBikeHour();
    }

    @Bean
    @Scope("prototype")
    public RentBikeDay rentBikeDay() {
        return new RentBikeDay();
    }

    @Bean
    @Scope("prototype")
    public RentBikeWeek rentBikeWeek() {
        return new RentBikeWeek();
    }

    @Bean
    @Scope("prototype")
    public Params params() {
        return new Params();
    }

    @Bean
    @Scope("prototype")
    public RentCarHour rentCarHour() {
        return new RentCarHour();
    }

    @Bean
    @Scope("prototype")
    public RentCarDay rentCarDay() {
        return new RentCarDay();
    }

    @Bean
    @Scope("prototype")
    public RentCarWeek rentCarWeek() {
        return new RentCarWeek();
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