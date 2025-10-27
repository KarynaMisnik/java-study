package AgeChecker;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age: ");
        int age = scanner.nextInt();

        if (age >= 0 && age < 13) {
            System.out.println("You are a kid.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager.");
        } else if (age >= 20 && age <= 64) {
            System.out.println("You are an adult");
        } else if (age >= 65) {
            System.out.println("You are a senior");
        } else {
            System.out.println("Invalid");
        }
        scanner.close();
    }
}