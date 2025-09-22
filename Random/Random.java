package Random;

public class Random {
    public static void main(String[] args) {
        int ran = (int) (Math.random() * 6);

        if (ran < 3) {
            System.out.println(ran + " Random number is below 3");
        } else if (ran > 3) {
            System.out.println(ran + " Random number is above 3");
        } else {
            System.out.println(ran + " Random number is equal to 3");
        }
    }
}