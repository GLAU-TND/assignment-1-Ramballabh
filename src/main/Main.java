package main;

import definition.Queue;
import person.Person;

import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Person> queue = new Queue<>();
        System.out.println("Welcome to DBC's Contact List App\n" +
                "Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                this.addContact();
        }

    }

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.print("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person\n" +
                "First Name:");
        String fName = scanner.nextLine();
        System.out.print("Last Name:");
        String lName = scanner.nextLine();
        System.out.print("Contact Number: ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();
        do {
            System.out.print("Would you like to add another contact number? (y/n):");
            s = scanner.next();

        } while (s.equalsIgnoreCase("y"));
    }

}
