
package com.educacionit.test;


public class SQLFailureException extends Exception {


    public SQLFailureException() {
    }

    public SQLFailureException(String message) {
        super(message);
    }

    public SQLFailureException(Throwable cause) {
        super(cause);
    }
}