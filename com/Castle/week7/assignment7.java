package com.Castle.HelloWorld.com.Castle.week7;
import java.util.*;

class Contact {
    private String name;
    private String email;
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

class ContactCollect {
    private Contact contact;

    List<Contact> listOfContacts = new ArrayList<Contact>();

    public ContactCollect() {
        this.contact = contact;
    }

    public void addContact(Contact contact) {
        this.contact = contact;
        listOfContacts.add(contact);
    }
    public void showAll(){
        System.out.println(contact);
        for(Contact contact: listOfContacts){
            contact.display();
        }
    }
}


public class assignment7 {
    public static void main(String[] args) {
        Contact one = new Contact("Jessica Harris", "jessica@harris.com");
        Contact two = new Contact("Ean Mcfaddin", "ean@mcfaddin.com");
        Business bOne = new Business("Mark Killoran", "mark@killoran.com","614-385-3858");
        Business bTwo = new Business("Blaine Greene", "blaine@greene.com", "614-374-3845");
        ContactCollect myCollection = new ContactCollect();
        myCollection.addContact(one);
        myCollection.addContact(two);
        myCollection.addContact(bOne);
        myCollection.addContact(bTwo);
        myCollection.showAll();
    }
}