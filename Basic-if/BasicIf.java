import java.util.Scanner;

public class BasicIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}