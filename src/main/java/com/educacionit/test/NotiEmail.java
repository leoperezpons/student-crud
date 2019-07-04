
package com.educacionit.test;


import com.educacionit.students.services.INotification;


public class NotiEmail implements INotification {


    @Override
    public void send (String from, String to, String subject, String content) {

        System.out.println (String.format ("%s envia el mensaje \"%s\" con el contenido \"%s\" a %s", from, subject, content, to));
    }
}
