import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your age: ");
        int age = sc.nextInt();

        if (age >= 0 && age <= 120) {
            if (age <= 18) {
                System.out.println("Minor");
            } else {
                int group;
                if (age <= 30) {
                    group = 1;
                } else if (age <= 60) {
                    group = 2;
                } else {
                    group = 3;
                }
                switch (group) {
                    case 1:
                        System.out.println("Young adult");
                        break;
                    case 2:
                        System.out.println("Adult");
                        break;
                    case 3:
                        System.out.println("Senior");
                        break;
                }
            }

        } else {
            System.out.println("Invalid input");

        }
    }
}
