package daynineproblems;

import daynineproblems.classes.AddressBook;
import daynineproblems.classes.Contact;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("===================================================================");
        System.out.println("===================================================================");
        System.out.println("===================================================================");
        System.out.println();
        System.out.println("WELCOME DO ADDRESS BOOK");
        System.out.println();
        System.out.println("===================================================================");
        System.out.println("===================================================================");
        System.out.println("===================================================================");

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        System.out.print("Enter Zip: ");
        long zip = sc.nextLong();

        System.out.print("Enter Phone Number: ");
        long phoneNumber = sc.nextLong();
        sc.nextLine(); // consume newline

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Contact contact = new Contact(firstName, lastName, address,
                city, state, zip, phoneNumber, email);

        addressBook.addContact(contact);

        System.out.println("\nSaved Contacts:");
        addressBook.displayContacts();

        // UC2 Edit Contact
        System.out.print("\nEnter First Name to Edit: ");
        String nameToEdit = sc.nextLine();

        System.out.println("\nAfter Edit:");
        addressBook.displayContacts();

        // UC3 Delete Contact
        System.out.print("\nEnter First Name to Delete: ");
        String nameToDelete = sc.nextLine();
        addressBook.deleteContact(nameToDelete);

        System.out.println("\nFinal Contacts:");
        addressBook.displayContacts();

    }
}
