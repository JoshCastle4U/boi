package com.Castle.HelloWorld.com.Castle.week4;
import java.util.*;
/**
 * Created by 016239 on 2/13/2018.
 */
public class Main {
    public static void main(String[] args) {
        userInput();
    }

    static void userInput() {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Please enter a city name, type 'END' to stop: ");
        String city = user_input.next();
        while (!(city.equals("END"))){
            System.out.print("Please enter temp day 1: ");
            double temp1 = user_input.nextDouble();
            System.out.print("Please enter temp day 2: ");
            double temp2 = user_input.nextDouble();
            System.out.print("Please enter temp day 3: ");
            double temp3 = user_input.nextDouble();
            System.out.print("Please enter temp day 4: ");
            double temp4 = user_input.nextDouble();
            System.out.print("Please enter temp day 5: ");
            double temp5 = user_input.nextDouble();
            calculate(city,temp1,temp2,temp3,temp4,temp5);
            System.out.print("Please the next city: ");
            city = user_input.next();
        }
    }
    static void calculate(String city, double temp1, double temp2, double temp3, double temp4, double temp5) {
        TreeMap<String, Double> tmap =
                new TreeMap<String, Double>();
        double average = (temp1 + temp2 + temp3 + temp4 + temp5)/ 5;
        tmap.put(city, average);
        outputMethod(tmap);
    }
    static void outputMethod(TreeMap<String, Double> tmap){
        System.out.println(tmap);    }
}