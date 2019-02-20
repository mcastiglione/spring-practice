package com.javapractice.utility;

import com.javapractice.model.FamilyRental;
import com.javapractice.model.Params;
import com.javapractice.model.ParamsArr;
import com.javapractice.model.bike.RentBikeDay;
import com.javapractice.model.bike.RentBikeHour;
import com.javapractice.model.bike.RentBikeWeek;
import com.javapractice.model.car.RentCarDay;
import com.javapractice.model.car.RentCarHour;
import com.javapractice.model.car.RentCarWeek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.Iterator;

public class RentFamily implements FamilyRental {

    private Double fee = 0.0;

    @Autowired
    private transient Params params;

    @Autowired
    private transient RentCarHour rentCarHour;

    @Autowired
    private transient RentCarDay rentCarDay;

    @Autowired
    private transient RentCarWeek rentCarWeek;

    @Autowired
    private transient RentBikeHour rentBikeHour;

    @Autowired
    private transient RentBikeDay rentBikeDay;

    @Autowired
    private transient RentBikeWeek rentBikeWeek;

    private transient ArrayList<Params> rentals;

    @Value("${family.discount}")
    private Integer discount;

    private Integer Qty = 0;

    private ArrayList<String> data = new ArrayList<String>();

    public RentFamily(ParamsArr paramsArr) {
        this.rentals = paramsArr.getParams();
    }

    public RentFamily() {
    }

    public void setRentals(ParamsArr paramsArr) {
        this.rentals = paramsArr.getParams();
    }

    public boolean checkInfo() {
        this.rentals.stream().forEach(y -> this.Qty += y.getVehicles());
        return Qty <= 5 && Qty >= 3;
    }

    public boolean isInfoOK() {
        return false;
    }

    public void process() {

        this.fee = 0.0;
        this.Qty = 0;
        data = new ArrayList<String>();

        Iterator iter = this.rentals.iterator();

        while (iter.hasNext()) {
            params = (Params) iter.next();
            switch (params.getType()) {
                case "RentBikeHour":
                    rentBikeHour.setParams(params);
                    rentBikeHour.calculateFee();
                    data.add(rentBikeHour.data());
                    this.fee += rentBikeHour.getFee();
                    this.Qty += rentBikeHour.getQty();
                    break;
                case "RentBikeDay":
                    rentBikeDay.setParams(params);
                    rentBikeDay.calculateFee();
                    data.add(rentBikeDay.data());
                    this.fee += rentBikeDay.getFee();
                    this.Qty += rentBikeDay.getQty();
                    break;
                case "RentBikeWeek":
                    rentBikeWeek.setParams(params);
                    rentBikeWeek.calculateFee();
                    data.add(rentBikeWeek.data());
                    this.fee += rentBikeWeek.getFee();
                    this.Qty += rentBikeWeek.getQty();
                    break;
                case "RentCarHour":
                    rentCarHour.setParams(params);
                    rentCarHour.calculateFee();
                    data.add(rentCarHour.data());
                    this.fee += rentCarHour.getFee();
                    this.Qty += rentCarHour.getQty();
                    break;
                case "RentCarDay":
                    rentCarDay.setParams(params);
                    rentCarDay.calculateFee();
                    data.add(rentCarDay.data());
                    this.fee += rentCarDay.getFee();
                    this.Qty += rentCarDay.getQty();
                    break;
                case "RentCarWeek":
                    rentCarWeek.setParams(params);
                    rentCarWeek.calculateFee();
                    data.add(rentCarWeek.data());
                    this.fee += rentCarWeek.getFee();
                    this.Qty += rentCarWeek.getQty();
                    break;
                default:
                    break;
            }
        }

        this.fee = this.fee - (this.fee / 100 * this.discount.doubleValue());
    }

    public void logValues() {

    }

    public Double getFee() {
        return this.fee;
    }

    public Integer getQty() {
        return this.Qty;
    }

    public String data() {
        return data.toString();
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }


    public Integer getDiscount() {
        return discount;
    }
}