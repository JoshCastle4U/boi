package com.Castle.HelloWorld.com.Castle.week3;
import java.util.*;

/**
 * Created by 016239 on 2/8/2018.
 */
public class project1 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        String choice = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Choose an option");
        System.out.println("");
        System.out.println("(1) Add a task ");
        System.out.println("(2) Remove a task ");
        System.out.println("(3) Update a task ");
        System.out.println("(4) List all tasks ");
        System.out.println("(0) Exit ");
        choice = input.nextLine();
        do {
            //Splash screen with options
            System.out.println("Please Choose an option");
            System.out.println("");
            System.out.println("(1) Add a task ");
            System.out.println("(2) Remove a task ");
            System.out.println("(3) Update a task ");
            System.out.println("(4) List all tasks ");
            System.out.println("(0) Exit ");

            switch (choice) {

                case "1":
                    String task = add();
                    myList.add(task);
                    System.out.println("Please Choose an option");
                    choice = input.nextLine();
                    break;
                case "2":
                    String removed = remove();
                    myList.remove(removed);
                    System.out.println("Please Choose an option");
                    choice = input.nextLine();
                    break;
                case "3":
                    String change = changeRemove();
                    myList.remove(change);
                    change = changeUpdate();
                    myList.add(change);
                    System.out.println("Please Choose an option");
                    choice = input.nextLine();
                    break;
                case "4":
                    System.out.println(myList);
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
        System.out.println("Please provide a description of the tasks you wish to add");
        String taskadd = addition.nextLine();
        return taskadd;
    }
    static String remove(){
        Scanner remove = new Scanner(System.in);
        System.out.println("What task do you wish to remove.");
        String taskremove = remove.nextLine();
        return taskremove;
    }
    static String changeRemove(){
        Scanner update = new Scanner(System.in);
        System.out.println("What task do you wish to update?");
        String changeRemoved = update.nextLine();
        return changeRemoved;
    }
    static String changeUpdate(){
        Scanner update = new Scanner(System.in);
        System.out.println("What do you wish to change it to?");
        String changeUpdated = update.nextLine();
        return changeUpdated;
    }

}