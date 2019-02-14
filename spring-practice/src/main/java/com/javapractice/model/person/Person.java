package com.javapractice.model.person;

public class Person {
    private String name;
    private String lastName;
    private String address;
    private String email;
    private String phoneNumber;

    public Person(String name, String lastName, String address, String email, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}