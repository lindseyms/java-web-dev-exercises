package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double radius;
        double area;

        while(true){
            System.out.print("Enter a radius: ");
            radius = reader.nextDouble();

            if(radius < 0 ){
                System.out.println("You have entered an invalid response");
            }
            else{
                area= Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
                reader.close();
                break;
            }
        }

    }
}
