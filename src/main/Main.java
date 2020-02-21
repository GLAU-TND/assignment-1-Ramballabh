package main;

import definition.Queue;
import person.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Person> queue = new Queue<>();
        boolean flag = true;
        do {
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
                    addContact(queue);
                    break;
                case 2:
                    queue.print();
                    break;
                case 3:
                    System.out.println("You could search for a contact from their first names:");
                    String fName = scanner.nextLine();


                case 5:
                    flag = false;
                    break;
            }
        } while (flag);
    }

    public static Queue addContact(Queue queue) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        String s;
        System.out.print("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person\n" +
                "First Name:");
        String fName = scanner.nextLine();
        person.setfName(fName);
        System.out.print("Last Name:");
        String lName = scanner.nextLine();
        person.setlName(lName);
        System.out.print("Contact Number: ");
        long phoneNumber = scanner.nextLong();
        person.setPhoneNumber(phoneNumber);
        scanner.nextLine();
        do {
            System.out.print("Would you like to add another contact number? (y/n):");
            s = scanner.next();
            if (s.equalsIgnoreCase("y")) {
                System.out.print("Contact Number: ");
                long phoneNumber1 = scanner.nextLong();
                person.setPhoneNumber(phoneNumber1);
            }
        } while (s.equalsIgnoreCase("y"));
        scanner.nextLine();
        System.out.print("Would you like to add email address? (y/n):");
        s = scanner.next();
        scanner.nextLine();
        if (s.equalsIgnoreCase("y")) {
            System.out.print("Email Address: ");
            String email = scanner.nextLine();
            person.setEmail(email);
        }
        queue.add(person);
        queue.sort();
        return queue;
    }

}
