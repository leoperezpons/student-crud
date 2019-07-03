
package com.educacionit.students.beans;


import java.time.LocalDate;


public abstract class Person {


    private String name;

    private String lastName;

    private String email;

    private int dni;

    private LocalDate birthDay;

    private Address address;

    private String country;


    public static String NAME = "Person Class";



    public final int FINAL = 10;



    public Person () {

        super ();
    }

    public Person (int dni) {

        super ();

        this.dni = dni;
    }

    public Person (String name, String lastName) {

        super ();

        this.name     = name;
        this.lastName = lastName;
    }

    public Person (int dni, String name, String lastName) {

        super ();

        this.dni   = dni;
        this.name  = name;
        this.email = lastName;
    }

    public Person (String name, String lastName, int dni) {

        super ();

        this.name  = name;
        this.email = lastName;
        this.dni   = dni;
    }


    public void setName (String name) {

        this.name = name;
    }

    public String getName () {

        return name;
    }

    public String getLastName () {

        return lastName;
    }

    public void setLastName (String lastName) {

        this.lastName = lastName;
    }

    public String getEmail () {

        return email;
    }

    public void setEmail (String email) {

        this.email = email;
    }

    public int getAge () {

        LocalDate end  = LocalDate.now ();

        return end.getYear () - this.birthDay.getYear ();
    }

    public int getDni () {

        return dni;
    }

    public void setDni (int dni) {

        this.dni = dni;
    }

    public LocalDate getBirthDay () {

        return birthDay;
    }

    public void setBirthDay ( LocalDate birthDay) {

        this.birthDay = birthDay;
    }

    public Address getAddres () {

        return address;
    }

    public void setAddres (Address address) {

        this.address = address;
    }

    protected String getCountry() {

        return country;
    }

    protected void setCountry(String country) {

        this.country = country;
    }

    @Override
    public String toString () {

        return this.getLastName () + " " + this.getName ();
    }


    public final void myself () {

        System.out.println ("Hola !!! Yo soy " + this.name);
    }

    public static void printMyself () {

        System.out.println ("Soy una clase !!!");
    }
}