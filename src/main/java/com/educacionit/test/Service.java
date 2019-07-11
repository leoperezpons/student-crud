package com.educacionit.test;

public class Service {

    public void executeService1 () {


        DB db = new DB ();

        db.open ();

        db.execute1();

        db.close ();
    }

    public void executeService2 () throws SQLFailureException {


        DB db = new DB ();
        try {

            db.open ();

            db.execute2();

        } catch (Exception e) {

            System.out.println ("Ocurrio un error " + e.getMessage ());

            throw new SQLFailureException (e);

        } finally {

            db.close ();
        }

        db.execute1 ();

    }

    public void executeService3 () {


        DB db = new DB ();
        try {

            db.open ();

            db.execute2();

        } catch (Exception e) {

            System.out.println ("Ocurrio un error " + e.getMessage ());

            throw new ServiceException (e);

        } finally {

            db.close ();
        }

        db.execute1 ();

    }
}
