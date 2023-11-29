package Hackerrank;

import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> array = List.of(
                1, 2, 3, 4, 5
        );
        int biggerNumberInArray = array.get(0);
        int smallNumberInArray = array.get(0);

        for (int aNumber: array) {
            if (biggerNumberInArray < aNumber) biggerNumberInArray = aNumber;
            if (smallNumberInArray > aNumber) smallNumberInArray = aNumber;
        }

        int biggerSumInArray = 0;
        int smallerSumInArray = 0;

        for (int aNumber: array) {
            if (aNumber != biggerNumberInArray) smallerSumInArray += aNumber;
            if (aNumber != smallNumberInArray) biggerSumInArray += aNumber;
        }

        System.out.print(smallerSumInArray + " " + biggerSumInArray);
    }
}
