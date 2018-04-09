package com.Castle.HelloWorld.com.Castle.week8;
import java.util.*;
import java.util.Scanner;

class Contact {
    private String name;
    private String email;
    public Contact() {
    }
    public Contact(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void display() {
        System.out.println("Contact: " + name + " Email: " + email);
    }
}

class Business extends Contact {
    String phoneNumber;
    public Business(String name, String email, String phoneNumber){
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display(){
        System.out.println("Contact: " + getName() + " Email: " + getEmail() + " Phone Number: " + phoneNumber);
    }
}

class Collect extends Business {
    Scanner scanner = new Scanner(System.in);
    public Collect(String name, String email, String phoneNumber){
        super(name, email, phoneNumber);
    }
    public void collect(){
        System.out.println("Please enter the name of the contact");
        String inputName = scanner.nextLine();
        System.out.println("Please enter the email of the contact");
        String inputEmail = scanner.nextLine();
        System.out.println("Please enter the phone number of the contact");
        String inputPhone = scanner.nextLine();
    }
}


public class assignment8 {
    public static void main(String[] args) {
        Contact one = new Contact("Jessica Harris", "jessica@harris.com");
        Contact two = new Contact("Ean Mcfaddin", "ean@mcfaddin.com");
        Business bOne = new Business("Mark Killoran", "mark@killoran.com","614-385-3858");
        Business bTwo = new Business("Blaine Greene", "blaine@greene.com", "614-374-3845");
        Contact[] contacts = new Contact[] {one, two, bOne, bTwo};
        for (Contact contact: contacts){
            contact.display();
        }
    }
}