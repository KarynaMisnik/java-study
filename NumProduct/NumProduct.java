package NumProduct;

public class NumProduct {

    public static int Multiplier(int n, int m) {
        int mult = n * m;
        System.out.println("The product of " + n + " and " + m + " is: " + mult);
        return mult;

    }

    public static void main(String[] args) {
        Multiplier(6, 3);

    }
}