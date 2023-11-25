public class ReverseArrayWithoutCopy {

    static void whatThisDo (int[] numbers) {
        int smallPointer = 0;
        int bigPointer = numbers.length - 1;
        while (bigPointer > smallPointer) {
            int temp = numbers[smallPointer];
            numbers[smallPointer] = numbers[bigPointer];
            numbers[bigPointer] = temp;
            bigPointer--;
            smallPointer++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 5, 7, 2};
        whatThisDo(numbers);
        for (int number: numbers) { System.out.println(number); }
    }
}
