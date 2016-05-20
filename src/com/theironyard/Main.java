package com.theironyard;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, Double> accounts = new HashMap();

    public static void main(String[] args) throws Exception {
        int numInt;
        while (true) {
            System.out.println("Welcome to the IronBank");
            System.out.println("What is your name?");
            String name = scanner.nextLine();
            if (!accounts.containsKey(name)) {
                System.out.println("Invalid account. Would you like to create one? [ Y | N ]");
                String noAccount = scanner.nextLine();

                if (noAccount.equalsIgnoreCase("N")) {
                    System.out.println("Thank you Have a good Day.");
                    continue;

                }
                accounts.put(name, 100.00);

            }

            System.out.println("Greetings " + name);

            if (name.isEmpty()) {
                throw new Exception("Invalid name.");
            }


            while (true) {
                System.out.println("What would you like to do: | 1.Check balance | 2.Withdraw funds | 3.Cancel | 4.Delete Account");
                String choice = scanner.nextLine();
                numInt = Integer.valueOf(choice);


                if (numInt == 1) {
                    System.out.println("Your balance is $100");

                } else if (numInt == 2) {
                    System.out.println("How much would you like to withdraw?");
                    String amount = scanner.nextLine();
                    int numAmount = Integer.valueOf(amount);
                    Double balance = accounts.get(name);

                    if (numAmount > balance) {
                        throw new Exception("Insufficient Funds.");
                    } else if (numAmount < 100) {
                        System.out.println("Please take your money.");
                    }
                    System.out.println("Would you like to complete another transaction? (Y / N)");
                    String canContinue = scanner.nextLine();

                    if (canContinue.equalsIgnoreCase("N")) {
                        System.out.println("Thank you please come again.");

                        break;

                    }

                }

                else if (numInt == 3) {
                    System.out.println("Thank you please come again.");

                    break;
                }

                else if (numInt == 4) {
                    accounts.remove(name);
                    System.out.println("We are sorry to see you go.");
                    System.out.println("Thank you for your Business.");

                    break;
                }

                else {
                    System.out.println("Invalid Entry.");
                }
            }
        }
    }
}