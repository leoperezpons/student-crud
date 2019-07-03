
package com.educacionit.students.beans;


public class Teacher extends Person {


    private String education;


    public Teacher () {

        super ();
    }


    public Teacher (int dni) {

        super (dni);
    }

    public Teacher (int dni, String name, String lastName) {

        super (dni, name, lastName);
    }


    String getEducation() {

        return education;
    }

    void setEducation (String education) {

        this.education = education;
    }

    @Override
    public String toString () {

        return this.getName () + " " + this.getLastName ();
    }
}