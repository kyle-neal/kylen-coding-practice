package main.java;

import java.util.Scanner;

import main.java.problems.*;

public class Driver {
    public static void main(String[] args) {
        Problem problems[] = {
                null, // Using index of 1-8
                new Problem1(),
                new Problem2(),
                new Problem3()
        };
        do {
            printMenu();
            int choice = getChoice(problems.length - 1);
            problems[choice].solve();
        } while (true);
    }

    private static int getChoice(int max) {
        do {
            System.out.print("kylen-java-practice> ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                if (choice <= 0 || choice > max) {
                    System.out.println("Invalid choice, please choose a number between 0 and " + max);
                } else {
                    return choice;
                }
            } else {
                String choice;
                choice = sc.next();
                choice = choice.toLowerCase();
                if (choice.equals("q") || choice.equals("quit")) {
                    System.exit(0);
                } else {
                    System.out.println("Invalid choice, please choose a number between 0 and " + max);
                }
            }
        } while (true);
    }

    private static void printMenu() {
        System.out.println("---------------MENU---------------");
        System.out.println("| 1) Max Profit Stock Solver     |");
        System.out.println("| 2) Rotate Array                |");
        System.out.println("| 3) Balanced Delimiters         |");
        System.out.println("|                                |");
        System.out.println("| q || quit) To Quit             |");
        System.out.println("----------------------------------");
    }
}