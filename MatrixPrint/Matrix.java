public class Matrix {
    public static void main(String[] args) {
        int count = 5;
        for (int i = 1; i <= count; i++) {
            for (int k = 1; k <= i; k++) {
                /*
                 * System.out.print(i);
                 * it will print like
                 * 1
                 * 22
                 * 333
                 * 4444
                 * 55555
                 */
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

/*
 * Lets dive into details how it works, why we need two for-loops.
 * Outer loop: for (int i = 1; i <= 5; i++) - will create 5 rows
 * Inner loop: for (int k = 1; k <= i; k++) - for THIS row print i tomes
 * The outer loop decides HOW MANY rows
 * The inner loop decides WHAT happens inside each row
 * 
 */