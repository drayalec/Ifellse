// This program will prompt the user to enter a temperature between 92-104 and will print the corresponding category
//the temperature falls under:  92-97.5 = low / 97.5 - 99.5 = normal / 99.5 -104 = high

package com.example.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float temperature = 95.4f ; //setting temperature to a value so the while loop will run.

        // two int variables to set the parameters for the while statement to ensure proper user input.
        int min = 92;
        int max = 104;

        Scanner scanner = new Scanner(System.in); // scanner will be used to get user input.

            while(min <= temperature && temperature <= max) { //while statement will break if user enters invalid number
                System.out.println("Please enter a temperature between 92 and 104 degrees");
                temperature = scanner.nextFloat();  //this will update the temperature from user input.


                if (temperature < 97.5) {
                    System.out.println("The temperature is " + temperature + " degrees");
                    System.out.println("Meaning it is low!");
                } else if (temperature > 97.5 & temperature < 99.5) {
                    System.out.println("The temperature is " + temperature + " degrees");
                    System.out.println("Meaning it is normal!");
                } else {
                    System.out.println("The temperature is " + temperature + " degrees");
                    System.out.println("Meaning it is high!");
                }


            }
    System.out.println("The temperature you entered is invalid (Must be between 92 and 104)");
    }
}
