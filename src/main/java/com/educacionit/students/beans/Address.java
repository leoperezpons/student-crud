
package com.educacionit.students.beans;


public class Address {


    private String street;

    private int number;

    private String zipCode;


    public Address() {
    }

    public Address(String street, int number, String zipCode) {
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}