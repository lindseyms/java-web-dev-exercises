package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if(lang.equals("ar")) {
            return "مرحبا بالعالم";
        } else {
            return "Hello, World!";
        }
    }
}
