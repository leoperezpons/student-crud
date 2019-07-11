package com.educacionit.test;



public class TestDB {


    public static void main (String[] args) {

        // EJECUCION SIN ERRORES
        //System.out.println ("INICIANDO APPLICACION...");
        //Service s = new Service ();
        //s.executeService1 ();
        //System.out.println ("FINALIZANDO APPLICACION...");

        try {

            System.out.println ("INICIANDO APPLICACION...");
            Service s = new Service ();
            s.executeService2 ();
            System.out.println ("FINALIZANDO APPLICACION...");


        } catch (Exception e) {

            e.printStackTrace ();

        }

    }
}
