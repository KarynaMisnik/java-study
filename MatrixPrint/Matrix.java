public class Matrix {
    public static void main(String[] args) {
        int count = 5;
        for (int i = 1; i <= count; i++) {
            for (int k = 1; k <= i; k++) {
                // System.out.print(i);
                // it will print like
                // 1
                // 22
                // 333
                // 4444
                // 55555
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
