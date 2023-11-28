import java.util.List;

public class MinMaxSumInArray {
    public static void main(String[] args) {
        List<Integer> fivePositiveIntegerNumbers = List.of(
                7, 14, 3, 9, 22
        );

        int higherNumber = fivePositiveIntegerNumbers.get(0),
                secondaryHigherNumber = fivePositiveIntegerNumbers.get(1);
        int smallerNumber = fivePositiveIntegerNumbers.get(0),
                secondarySmallerNumber = fivePositiveIntegerNumbers.get(1);

        for (int i = 0; i < fivePositiveIntegerNumbers.size(); i++) {
            int aNumber = fivePositiveIntegerNumbers.get(i);
            if (higherNumber < aNumber) {
                higherNumber = aNumber;
            }
            if (smallerNumber > aNumber) {
                smallerNumber = aNumber;
            }
        }

        for (int i = 0; i < fivePositiveIntegerNumbers.size(); i++) {
            int aNumber = fivePositiveIntegerNumbers.get(i);
            if (secondaryHigherNumber < aNumber && aNumber != higherNumber) {
                secondaryHigherNumber = aNumber;
            }
            if (secondarySmallerNumber > aNumber && aNumber != smallerNumber) {
                secondarySmallerNumber = aNumber;
            }
        }
        int biggerSum = higherNumber + secondaryHigherNumber;
        int smallerSum = smallerNumber + secondarySmallerNumber;
        System.out.println(biggerSum);
        System.out.println(smallerSum);
    }
}
