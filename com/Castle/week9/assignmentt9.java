package com.Castle.HelloWorld.com.Castle.week9;
import java.util.*;

abstract class Contact {
    private String name;
    private int age;

    Contact(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract public void contact();
}
class EmailContact extends Contact{
    private String email;
    EmailContact(String name, int age, String email){
        super(name, age);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void contact(){
        System.out.println("Emailing " + getName());
    }
}

class PhoneContact extends Contact{
    private String number;
    PhoneContact(String name, int age, String number){
        super(name, age);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void contact(){
        System.out.println("Calling " + getName());
    }
}

public class assignmentt9 {
    public static void main(String[] args) {
        EmailContact jess = new EmailContact("Jessica Harris", 17, "jess@harris.com");
        PhoneContact killoran = new PhoneContact("Mark Killoran", 39, "mark@killoran.com");
        jess.contact();
        killoran.contact();}
}