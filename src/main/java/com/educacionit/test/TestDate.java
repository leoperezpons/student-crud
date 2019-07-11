
package com.educacionit.test;


import java.util.Date;
import java.util.Calendar;


public class TestDate {


    public static void main (String[] args) {


        Date d1 = new Date();

        System.out.println (d1);

        Calendar c1 = Calendar.getInstance ();

        Calendar c2 = Calendar.getInstance ();

        // 1
        c1.set (Calendar.YEAR, 1977);
        c1.set (Calendar.DATE, 9);
        c1.set (Calendar.MONTH, 6);

        // 2
        c1.set (1977, 6, 9);

        System.out.println (c1.getTime());

        System.out.println (c1.get (Calendar.YEAR));
        System.out.println (c1.get (Calendar.MONTH));
        System.out.println (c1.get (Calendar.DAY_OF_MONTH));
        System.out.println (c1.get (Calendar.DAY_OF_WEEK));
        System.out.println (c1.get (Calendar.DAY_OF_YEAR));


        c1.add (Calendar.DAY_OF_MONTH, 2);
        System.out.println (c1.get (Calendar.DAY_OF_MONTH));

        System.out.println (c1.after (c2));
        System.out.println (c1.before (c2));
        System.out.println (c2.get (Calendar.HOUR_OF_DAY));
        System.out.println (c2.get (Calendar.MINUTE));


    }
}
