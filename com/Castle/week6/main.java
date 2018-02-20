package com.Castle.HelloWorld.com.Castle.week6;
import java.util.*;
/**
 * Created by 016239 on 2/20/2018.
 */
class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }
            finally {
            }
        }

        return userInt;
    }
    public double promptdouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        double userdouble = 0;
        boolean isdouble = false;
        while (!isdouble) {
            try {
                userdouble = Double.parseDouble(userInput);
                isdouble = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }
            finally {
            }
        }

        return userdouble;
    }
    public String promptstring(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();
        boolean isString = false;
        while (!isString) {
            try {
                isString = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }
            finally {
            }
        }

        return userInput;
    }
}


public class main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int aNumber = input.promptInt("Enter an integer.");
        System.out.println("Your number is " + aNumber);
        double aDouble = input.promptdouble("Enter a double.");
        System.out.println("Your double is " + aDouble);
        String aString = input.promptstring("Enter an string.");
        System.out.println("Your String is " + aString);
    }
}