public class Reverse {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

}

/*
 * Outer loop will define how many rows, in this case 5
 * Inner loop: k <= n - i + 1
 * each row reduces the loop length
 * Simplify inner loop: k<= 5+1-i ==> 6-i ==> 5
 * Row i=1 ==> k<=5 Output: 12345
 * Row i=2 ==> k<=4 Output: 1234
 * Row i=3 ==> k<=3 Output: 123
 * Row i=2 ==> k<=4 Output: 12
 * Row i=1 ==> k<=4 Output: 1
 */
