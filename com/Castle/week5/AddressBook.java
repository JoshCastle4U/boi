package com.Castle.HelloWorld.com.Castle.week5;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by 016239 on 2/15/2018.
 */
public class AddressBook {
    private static TreeMap<String, String>tmap =
            new TreeMap<String, String>();
    public static void main(String[] args) {
        String choice = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Choose an option");
        System.out.println("");
        System.out.println("(1) Add a contact ");
        System.out.println("(2) Lookup by email ");
        System.out.println("(4) List all tasks ");
        System.out.println("(0) Exit ");
        choice = input.nextLine();
        do {
            //Splash screen with options
            System.out.println("Please Choose an option");
            System.out.println("");
            System.out.println("(1) Add a contact ");
            System.out.println("(2) Lookup by email ");
            System.out.println("(4) List all tasks ");
            System.out.println("(0) Exit ");

            switch (choice) {

                case "1":
                    Scanner addition = new Scanner(System.in);
                    System.out.println("Enter Full name");
                    String fullname = input.next();
                    System.out.println("Enter email");
                    String email = input.next();
                    Data person = new Data(fullname, email);
                    person.setFullname(fullname);
                    person.setEmail(email);
                    person.getFullname();
                    person.getFullname();
                    tmap.put(fullname, email);
                    System.out.println("Please Choose an option");
                    choice = input.nextLine();
                    break;
                case "2":
                    System.out.println("Enter the person you want to lookup");
                    String fullnameKey = input.next();
                    System.out.println("Email: " + tmap.get(fullnameKey));
                    System.out.println("Please Choose an option");
                    choice = input.nextLine();
                    break;
                case "3":
                    System.out.println(tmap);
                    System.out.println("Please Choose an option");
                    choice = input.nextLine();
                    break;
            }
        }
        while (Integer.parseInt(choice) > 0);

        System.out.println("Exit");
    }
    static String add() {
        Scanner addition = new Scanner(System.in);
        System.out.println("Please enter fullname");
        String fullname = addition.nextLine();
        return fullname;
    }}
class Data {
    private String fullname = null;
    private String email = null;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Data(String fullname, String email){
        this.fullname = fullname;
        this.email = email;
    }


}

