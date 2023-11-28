package MinMaxSumInArray;

import java.util.List;

public class MinMaxSumInArray {
    public void MinMaxSum (List<Integer> arrayOfFivePositivesAndIntegerNumbers) throws NegativeNumberException{
        int arrayLength = 5;
        for (int aNum: arrayOfFivePositivesAndIntegerNumbers) {
            if (aNum < 0) {
                throw new NegativeNumberException();
            }
        }
        int maxSum = 0, minSum = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (arrayOfFivePositivesAndIntegerNumbers
                    .get(i) + arrayOfFivePositivesAndIntegerNumbers
                    .get(i + 1) > maxSum) {

            }
        }
    }
    public static void main(String[] args) {

    }
}
