package quintaLista;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum number of contacts: ");
        int quantityContact = sc.nextInt();

        String[] personCode = new String[quantityContact];
        String[] personPhone = new String[quantityContact];
        int[] personAges = new int[quantityContact];

        while (true) {
            int contactNumber = 0;
            int option;
            do {
                System.out.println("OPTION 1 - ENTER A NEW CONTACT/ OPTION 2 - REMOVE A CONTACT/ OPTION 3 - EXIT");

                System.out.print("Please select one of the options above: ");
                option = sc.nextInt();
            } while (option == 0);

            switch (option) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Enter person code: ");
                    personCode[contactNumber] = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    personPhone[contactNumber] = sc.nextLine();
                    System.out.print("Enter person age: ");
                    personAges[contactNumber] = sc.nextInt();
                    contactNumber++;
                }
                case 2 -> {
                    for (int i = 0; i < quantityContact; i++) {
                        if (personCode[i] != null) {
                            System.out.println("Contact " + i + 1);
                            System.out.println("Person code: " + personCode[i]);
                            System.out.println("Person phone: " + personPhone[i]);
                            System.out.println("Person ages: " + personAges[i]);
                        }
                    }
                    System.out.print("Enter the number of the contact you want to delete: ");
                    int contactRemove = sc.nextInt();
                    personCode[contactRemove - 1] = null;
                    personPhone[contactRemove - 1] = null;
                    personAges[contactRemove - 1] = 0;
                }
                default -> System.out.println("Ending the system!");
            }
            if (option == 3) {
                break;
            }

        }
    }

    }