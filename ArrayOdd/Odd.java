public class Odd {
    public static void main(String[] args) {
        int arr[] = { 9, 34, 1, 0, 7, 44, 65 };

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            }
        }

        int[] odds = new int[count];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                odds[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < odds.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(odds[i]);
        }
        System.out.println();
    }
}