package exercises.lesson1;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;

        System.out.print("Hello, what is your name: ");
        name = input.nextLine();
        input.close();
        System.out.println("Hello " + name);
    }
}
