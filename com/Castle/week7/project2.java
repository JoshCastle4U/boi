package com.Castle.HelloWorld.com.Castle.week7;
import java.util.*;
/**
 * Created by 016239 on 3/1/2018.
 */
public class project2 {
    public static void main(String[] args) {
        ArrayList<Data> list = new ArrayList<>();
        String choice = null;
        Scanner input = new Scanner(System.in);
        listDisplay();
        choice = input.nextLine();
        while (!choice.equals("0")) {
            if (choice.equals("1")) {
                Data person = createTask();
                list.add(person);
            }
            else if (choice.equals("2")) {
                String title = remove();
                list.removeIf(person -> person.getTitle().equals(title));
            }
            else if (choice.equals("3")){
                System.out.println("What task do you wish to update?");
                String title = input.nextLine();
                list.removeIf(person -> person.getTitle().equals(title));
                Data person = createTask();
                list.add(person);
            }
            else if (choice.equals("4")) {
                Scanner listStuff = new Scanner(System.in);
                System.out.println("Enter 6 for all or 0-5 for target priority");
                int number = listStuff.nextInt();
                for (Data person : list) {
                    if (number == 6) {
                        person.display();
                    } else if(number == person.getPriority()){
                        person.display();
                    }

                }
            }
            else {
                System.out.println("You entered a wrong value.");
            }
            listDisplay();
            choice = input.nextLine();
        }

        System.out.println("Exit");
    }

    static String addTitle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter title");
        String title = input.nextLine();
        return title;
    }

    static String addDescription() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter description");
        String desc = input.nextLine();
        return desc;
    }

    static int addPriority() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a priority 0-5");
        int priority = input.nextInt();
        return priority;
    }
    static Data createTask(){
        Scanner addition = new Scanner(System.in);
        String title = addTitle();
        String desc = addDescription();
        int priority = addPriority();
        Data person = new Data(title, desc, priority);
        return person;
    }
    static String remove() {
        Scanner remove = new Scanner(System.in);
        System.out.println("Give the title of the task you wish to remove.");
        String title = remove.nextLine();
        return title;
    }

    static String changeRemove() {
        Scanner update = new Scanner(System.in);
        System.out.println("What task do you wish to update?");
        String changeRemoved = update.nextLine();
        return changeRemoved;
    }

    static String changeUpdate() {
        Scanner update = new Scanner(System.in);
        System.out.println("What do you wish to change it to?");
        String changeUpdated = update.nextLine();
        return changeUpdated;
    }
    static void listDisplay(){
        System.out.println("Please Choose an option");
        System.out.println("(1) Add a task ");
        System.out.println("(2) Remove a task ");
        System.out.println("(3) Update a task ");
        System.out.println("(4) List all tasks ");
        System.out.println("(0) Exit ");
    }
}
     class Data {
        private String title;
        private String desc;
        private int priority;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String title) {
            this.desc = desc;
        }

        public int getPriority() {
            return priority;
        }

        public int setPriority(int priority) {
            return this.priority;
        }

        public Data(String title, String desc, int priority) {
            this.title = title;
            this.desc = desc;
            this.priority = priority;
        }
        public void display(){
            System.out.println("Title: " + this.title + "\nDescription: " + this.desc + "\nPriority: " + this.priority);
        }
    }

