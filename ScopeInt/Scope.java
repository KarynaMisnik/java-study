import java.util.Scanner;
// In this example better to use nested if, instead of switch

public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type number: ");
        int num = sc.nextInt();

        if (num >= 0 && num <= 100) {
            if (num >= 90) {
                System.out.println("Grade A");
            } else {
                int score;
                if (num >= 80) {
                    score = 1;
                } else if (num >= 70) {
                    score = 2;
                } else if (num >= 60) {
                    score = 3;
                } else {
                    score = 4;
                }
                switch (score) {
                    case 1:
                        System.out.println("Grade B");
                        break;
                    case 2:
                        System.out.println("Grade C");
                        break;
                    case 3:
                        System.out.println("Grade D");
                        break;
                    case 4:
                        System.out.println("Fail");
                        break;
                }
            }
        } else {
            System.out.println("Invalid score");
        }
    }
}