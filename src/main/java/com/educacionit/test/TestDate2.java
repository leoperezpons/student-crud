
package com.educacionit.test;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class TestDate2 {


    public static void main (String[] args) {



        LocalDate d1 = LocalDate.now ();
        LocalDate d2 = LocalDate.of (1977, 7, 9);

        System.out.println (d1);
        System.out.println (d2);
        System.out.println (d2.getYear());
        System.out.println (d2.getMonth());
        System.out.println (d2.getMonth().getValue());

        LocalTime h1 = LocalTime.now ();
        LocalTime h2 = LocalTime.of (20, 0, 0);

        System.out.println (h1);
        System.out.println (h2);

        LocalDateTime lh1 = LocalDateTime.now ();
        LocalDateTime lh2 = LocalDateTime.of (1977, 7, 9, 10, 10, 10);

        System.out.println (lh1);
        System.out.println (lh2);

    }
}
