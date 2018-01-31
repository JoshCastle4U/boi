package com.Castle.HelloWorld.com.Castle.week3;
import java.util.Scanner;
/**
 * Created by 016239 on 1/30/2018.
 */
public class Main {

    static void celsiusToFahrenheit(int foofoo) {
        double fahrenheitValue = 9.0 / 5 * foofoo + 32;
        System.out.println(foofoo + " degrees Celsius is equal to " + fahrenheitValue + " degrees Fahrenheit.");

    }

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a Temperature: ");
        int usernumber = user_input.nextInt();
        while (usernumber >= -460) {
            celsiusToFahrenheit(usernumber);
            System.out.print("Enter a Temperature: ");
            usernumber = user_input.nextInt();
        }

    }


/*
    public static int minFunction(double fahrenheitValue, double usernumber) {
        System.out.println(usernumber + " degrees Celsius is equal to "
                + fahrenheitValue + " degrees Fahrenheit.");*/


}