package com.educacionit.test;

public class Message {


    public static final int VAL1 = 1;

    public static final int VAL2 = 1;

    public static final int VAL3 = 1;



    public static void print (Valores arg) {


        if (arg == Valores.VAL1) {

            System.out.println ("Valor 1");

        } else if (arg == Valores.VAL2) {

            System.out.println ("Valor 2");

        } else if (arg == Valores.VAL2) {

            System.out.println ("Valor 3");

        }
    }



    public static void main (String[] args) {

        Message.print (Valores.VAL1);
        Message.print (Valores.VAL2);
        Message.print (Valores.VAL3);
    }
}
