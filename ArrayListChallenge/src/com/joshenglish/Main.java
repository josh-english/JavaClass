package com.joshenglish;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        boolean finished = false;
        while (!finished) {
            mobilePhone.printMenu();
            System.out.println("Enter your menu command:\r");
            int option = scanner.nextInt();
            scanner.nextLine();
            String name;
            String number;
            switch (option) {
                case 0:
                    finished = true;
                    break;
                case 1:
                    mobilePhone.listContacts();
                    break;
                case 2:
                    System.out.println("Enter new contact name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter new contact number: ");
                    number = scanner.nextLine();
                    Contact newContact = new Contact(name, number);
                    mobilePhone.addContact(newContact);
                    break;
                case 3:
                    System.out.println("Enter the name of the contact you want to update: ");
                    String oldName = scanner.nextLine();
                    System.out.println("Enter updated contact name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter updated contact number: ");
                    number = scanner.nextLine();
                    Contact updatedContact = new Contact(name, number);
                    mobilePhone.updateContact(oldName, updatedContact);
                    break;
                case 4:
                    System.out.println("Enter the name of the contact you want to remove: ");
                    String toRemove = scanner.nextLine();
                    mobilePhone.removeContact(toRemove);
                    break;
                case 5:
                    System.out.println("Enter the name of the contact you want to find: ");
                    String toFind = scanner.nextLine();
                    mobilePhone.findContact(toFind);
                    break;
                default:
                    System.out.println("Menu command not recognized!");
                    break;
            }
        }
    }
}
