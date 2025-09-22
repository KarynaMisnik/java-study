package Grade;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your grade: ");

        int grade = scanner.nextInt();

        switch (grade) {
            case 0:
                System.out.println("Failed");
                break;
            case 1:
                System.out.println("Poor");
                break;
            case 2:
                System.out.println("Poor");
                break;
            case 3:
                System.out.println("Satisfactory");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}