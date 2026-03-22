import java.util.Scanner;

public class IfRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type number 1-5: ");
        int num = sc.nextInt();

        if (num > 0 && num <= 5) {
            switch (num) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                // redundant here, code will never reach default
                default:
                    System.out.println("Out of range");
            }

        } else {
            System.out.println("Out of range");
        }
    }
}
