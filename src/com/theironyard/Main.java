package com.theironyard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome Banker");
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Welcome to IronBank " + name);

    }

}
