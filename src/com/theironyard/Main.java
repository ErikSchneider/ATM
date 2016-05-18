package com.theironyard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome Banker");
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Welcome to IronBank " + name);

        if (name.isEmpty() ) {
            throw new Exception("Invalid name.");

        }
        System.out.println("What would you like to do: | 1.Check balance | 2.Withdraw funds | 3.Cancel |");
        String choice = scanner.nextLine();
        int numInt = Integer.valueOf(choice);

        if (numInt == 1) {
            System.out.println("Your balance is $100");

        }
        else if (numInt == 2) {
            System.out.println("How much would you like to withdraw?");
            String amount = scanner.nextLine();
            int numAmount = Integer.valueOf(amount);

            if (numAmount > 100) {
                throw new Exception ("Insufficient Funds.");
            }


        }

        else if (numInt == 3) {
            System.out.println("Thank you please come again");




        }




    }

}
