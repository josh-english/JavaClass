package com.joshenglish;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void listContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("Contact #" + (i+1));
            System.out.println("Name: " + contacts.get(i).getName());
            System.out.println("Number: " + contacts.get(i).getNumber());
        }
    }

    public void addContact(Contact newContact) {
        if(!this.hasContact(newContact)) {
            contacts.add(newContact);
        } else {
            System.out.println("Contact already exists!");
        }
    }

    private boolean hasContact(Contact other) {
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getName().equals(other.getName())) {
                return true;
            }
        }
        return false;
    }

    public void updateContact(String oldName, Contact updatedContact) {
        int index = this.getContact(oldName);
        if(index != -1) {
            contacts.set(index, updatedContact);
        } else {
            System.out.println("Could not find contact with name: " + oldName);
            System.out.println("Did not update any contacts!");
        }
    }

    private int getContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void removeContact(String toRemove) {
        int index = this.getContact(toRemove);
        if (index != -1) {
            contacts.remove(index);
        } else {
            System.out.println("Could not find contact with name: " + toRemove);
            System.out.println("Did not remove any contacts!");
        }
    }

    public void findContact(String toFind) {
        int index = this.getContact(toFind);
        if(index != -1) {
            System.out.println("Contact's number is: " + contacts.get(index).getNumber());
        } else {
            System.out.println("Could not find contact with name: " + toFind);
        }
    }

    public static void printMenu() {
        System.out.println("0 - Quit Program");
        System.out.println("1 - List Contacts");
        System.out.println("2 - Add a new Contact");
        System.out.println("3 - Update a Contact");
        System.out.println("4 - Remove a Contact");
        System.out.println("5 - Find a Contact");
    }
}
