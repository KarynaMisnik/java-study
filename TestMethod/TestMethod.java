package TestMethod;

import java.util.Scanner;

public class TestMethod {

    public static void Print(String text, int num) {
        for (int i = 0; i < num; i++) {
            String capital = text.substring(0, 1).toUpperCase() + text.substring(1);
            System.out.println(capital);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What do you want to print: ");
        String txt = sc.nextLine();
        System.out.print("How many times: ");
        int times = sc.nextInt();
        Print(txt, times);
        sc.close();
    }
}