package com.javapractice.utility;

import com.javapractice.model.FamilyRental;
import com.javapractice.model.Rental;

import java.util.ArrayList;

public class RentFamily implements FamilyRental {

    private Double fee = 0.0;

    private ArrayList<Rental> rentals;

    private Integer discount;

    private Integer Qty = 0;

    public RentFamily(ArrayList<Rental> rentals) {
        this.rentals = rentals;
    }

    public RentFamily() {
    }

    public boolean checkInfo() {
        if (Qty > 5 || Qty < 3) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isInfoOK() {
        return false;
    }

    public void calculateFee() {
        this.rentals.stream().forEach(y->this.fee += y.getFee());
        this.fee = this.fee - (this.fee/100*this.discount.doubleValue());

        this.rentals.stream().forEach(y->this.Qty += y.getQty());
    }

    public void logValues() {

    }

    public Double getFee() {
        return this.fee;
    }

    public Integer getQty() {
        return this.Qty;
    }

    public String printData() {
        this.rentals.stream().forEach(y->System.out.println(y.printData()));
        return new String("end!");
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }


    public Integer getDiscount() {
        return discount;
    }
}