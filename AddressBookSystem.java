package com.bridgelabz.AddressBook;

import java.util.Scanner;

public class AddressBookSystem {
	public static void main(String[] args) {
        System.out.println("*_*_*_*_*_*_*_*_*_*_Welcome to Address Book_*_*_*_*_*_*_*_*_*_*");
        Contact contact = new Contact();
        String name;
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to Add Contact \nEnter 2 To Show Added Contacts ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    contact.addUser();
                    System.out.println();
                    System.out.println("Added Successfully...");
                    System.out.println();
                    break;

                case 2:
                    //22System.out.println(" ");
                    //System.out.println("            " + " First Name " + " Last Name " + " Address " + " City " + " State " + " Zip Code " + " Conatct Number " + " E-mail ID ");
                    contact.display();
                    break;

                default:
                    System.out.println("You have Entered Wrong Choice ");
            }
        }

    }
}

