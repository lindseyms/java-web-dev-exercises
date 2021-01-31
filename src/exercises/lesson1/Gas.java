package exercises.lesson1;

import java.util.Scanner;

public class Gas {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int miles;
        int gallonsConsumed;
        double mpg;

        System.out.print("How many miles have you driven? ");
        miles = input.nextInt();

        System.out.print("How much gas has your car consumed (in gallons?) ");
        gallonsConsumed = input.nextInt();
        input.close();

        mpg = miles/gallonsConsumed;

        System.out.print("Your miles-per-gallon: "+mpg);
    }
}
