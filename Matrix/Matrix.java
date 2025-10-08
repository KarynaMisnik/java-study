package Matrix;

public class Matrix {
    public static void PrintMatrix(int matrix) {
        int num = 1;
        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j < matrix; j++) {
                System.out.print(num);
                num++;

            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        PrintMatrix(2);
    }
}
