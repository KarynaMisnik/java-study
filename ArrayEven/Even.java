public class Even {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 88, 13, 75, 55, 34 };
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
