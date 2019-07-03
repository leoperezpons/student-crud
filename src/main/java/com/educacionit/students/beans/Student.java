
package com.educacionit.students.beans;


public class Student extends Person {


    private int identity;


    public Student () {

        super ();
    }


    public Student (int dni) {

        super (dni);
    }


    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }
}