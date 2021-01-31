package org.launchcode.java.demos;

public class HelloWorld {

    private String message = "Hello World";

    public HelloWorld(){ }

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String aMessage) {
        message = aMessage;
    }

}