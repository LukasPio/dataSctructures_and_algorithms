public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 2, 7, 10, 4, 3, 8, 6};
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                int number1 = arr[i], number2 = arr[i + 1];
                if (number1 > number2) {
                    arr[i] = number2;
                    arr[i + 1] = number1;
                    swap = true;
                }
            }
        } while (swap);
        int i = 0;
        for (int number: arr) {
            System.out.println("Number at position " + i + ": " + number);
            i++;
        }
    }
}
