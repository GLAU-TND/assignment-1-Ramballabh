package main;

import definition.SinglyLinkedLIst;
import person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        SinglyLinkedLIst<Person> list = new SinglyLinkedLIst<>();
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
                    addContact(list, list1, list2);
                    break;
                case 2:
                    list.print();
                    break;
                case 3:
                    searchContact(list, list2);
                    break;
                case 4:
                    removeContact(list, list1);
                    break;
                case 5:
                    flag = false;
                    break;
            }
        } while (flag);
    }

    public static SinglyLinkedLIst addContact(SinglyLinkedLIst list, List list1, List list2) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        String s;
        System.out.print("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person\n" +
                "First Name:");
        String fName = scanner.nextLine();
        person.setfName(fName);
        list1.add(fName);
        list2.add(fName);
        System.out.print("Last Name:");
        String lName = scanner.nextLine();
        person.setlName(lName);
        list1.add(lName);
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
        list.add(person);
        return list;
    }

    public static SinglyLinkedLIst removeContact(SinglyLinkedLIst list, List list1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here are all your contacts:");
        int k = 1;
        for (int i = 0; i < list1.size() - 1; i = i + 2) {
            System.out.println(k + "." + list1.get(i) + " " + list1.get(i + 1));
            k++;
        }
        System.out.print("Press the number against the contact to delete it:");
        int i = scanner.nextInt();
        list.remove(i - 1);
        if (i == 1) {
            System.out.println(list1.get(i - 1) + " " + list1.get(i) + "'s contact deleted from list!");
        } else {
            System.out.println(list1.get(i + i - 2) + " " + list1.get(i + i - 1) + "'s contact deleted from list!");
        }
        return list;
    }

    public static SinglyLinkedLIst searchContact(SinglyLinkedLIst list, List list2) {
        System.out.println("You could search for a contact from their first names:");
        Scanner scanner = new Scanner(System.in);
        String fName = scanner.nextLine();
        int k = 0;
        for (int i = 0; i < list2.size(); i++) {
            if (fName.equals(list2.get(i))) {
                k++;
            }
        }
        System.out.println(k + " match found!");
        for (int i = 0; i < list2.size(); i++) {
            if (fName.equals(list2.get(i))) {
                list.print(i + 1);
            }
        }
        return list;
    }
}
