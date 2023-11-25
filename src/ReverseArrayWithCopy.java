public class ReverseArrayWithCopy {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 5, 2, 7, 5};
        int[] numbersReversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersReversed[i] = numbers[numbers.length - i - 1];
        }
        for (int number: numbersReversed) {
            System.out.println(number);
        }
    }
}
