package MinMaxSumInArray;

import java.util.List;

public class MinMaxSumInArray {
    public void MinMaxSum (List<Integer> arrayOfFivePositivesAndIntegerNumbers) throws NegativeNumberException{
        int length = 5;
        for (int aNum: arrayOfFivePositivesAndIntegerNumbers) {
            if (aNum < 0) {
                throw new NegativeNumberException();
            }
        }
        int maxSum = 0, minSum = 0;


    }
    public static void main(String[] args) {

    }
}
