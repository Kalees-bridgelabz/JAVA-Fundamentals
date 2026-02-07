package daynineproblems.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void displayContacts() {
        for (Contact c : contactList) {
            c.displayContact();
        }
    }

    public void editContact(String name, Scanner sc) {
        boolean found = false;

        for (Contact c : contactList) {
            if (c.firstName.equalsIgnoreCase(name)) {
                found = true;

                System.out.print("Enter New Address: ");
                c.address = sc.nextLine();

                System.out.print("Enter New City: ");
                c.city = sc.nextLine();

                System.out.print("Enter New State: ");
                c.state = sc.nextLine();

                System.out.print("Enter New Zip: ");
                c.zip = sc.nextLong();

                System.out.print("Enter New Phone Number: ");
                c.phoneNumber = sc.nextLong();
                sc.nextLine(); // consume newline

                System.out.print("Enter New Email: ");
                c.email = sc.nextLine();

                System.out.println("Contact updated successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found!");
        }
    }
}