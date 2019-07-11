package com.educacionit.test;

public class DB {


    public void open () {

        System.out.println ("ABRIENDO CONEXION ...");
    }

    public void execute1 () {

        System.out.println ("CONSULTANDO BASE DE DATOS 1 ...");
    }

    public void execute2 () {

        System.out.println ("CONSULTANDO BASE DE DATOS 2 ...");
        int i = 1/0;
    }

    public void execute3 () {

        System.out.println ("CONSULTANDO BASE DE DATOS 3 ...");
        String a = null;
        a.toUpperCase();
    }

    public void close () {

        System.out.println ("CERRANDO CONEXION ...");
    }
}
