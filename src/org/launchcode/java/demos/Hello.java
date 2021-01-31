package org.launchcode.java.demos;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld("goodbye");
        System.out.println(helloWorld.getMessage());
    }
}
