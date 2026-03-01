public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < arr.length / 2; i++) {
            // each swap fixes TWO positions
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            /*
             * Save left value
             * Move right value to left
             * Move saved value to right
             */
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
