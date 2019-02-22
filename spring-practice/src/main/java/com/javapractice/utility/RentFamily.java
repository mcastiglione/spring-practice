package com.javapractice.utility;

import com.javapractice.model.FamilyRental;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;

public class RentFamily implements FamilyRental {

    private Double fee = 0.0;

    private ArrayList<String[]> rentals;

    @Value("${family.discount}")
    private Integer discount;

    private Integer Qty = 0;

    public RentFamily(ArrayList<String[]> rentals) {
        this.rentals = rentals;
    }

    public RentFamily() {
    }

    public void setRentals(ArrayList<String[]> rentals) {
        this.fee = 0.0;
        this.rentals = rentals;
    }

    public boolean checkInfo() {
        this.rentals.stream().forEach(y -> this.Qty += Integer.parseInt(y[3]));
        return Qty <= 5 && Qty >= 3;
    }

    public boolean isInfoOK() {
        return false;
    }

    public void calculateFee() {
        this.rentals.stream().forEach(y -> this.fee += Double.parseDouble(y[1]));
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
        ArrayList<String> data = new ArrayList<String>();
        rentals.stream().forEach(y -> data.add(y[0]));
        return data.toString();
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }


    public Integer getDiscount() {
        return discount;
    }
}