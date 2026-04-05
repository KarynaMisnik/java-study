public class Reversed {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = n; k >= n - i + 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

/*
 * k = n → for each row, start k at 5
 * k >= n - i + 1 → shrinking boundary(stopping condition)
 * k-- → go down(move k downward by 1 each step)
 * 
 * Output:
 * 5
 * 54
 * 543
 * 5432
 * 54321
 */