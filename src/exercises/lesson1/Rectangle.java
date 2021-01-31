package exercises.lesson1;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double length;
        double width;
        double area;

        System.out.print("What is the length of the rectangle? ");
        length = input.nextDouble();

        System.out.print("What is the width of the rectangle? ");
        width = input.nextDouble();
        input.close();

        area = length * width;

        System.out.println("The area of your rectangle is " + area);
    }
}
