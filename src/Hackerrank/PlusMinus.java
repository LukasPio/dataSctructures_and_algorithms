package Hackerrank;

import java.util.List;

public class PlusMinus {
    static void plusMinus (List<Integer> array) {
        double negativePercent = 0, positivePercent = 0, nullPercent = 0;

        for (int number: array) {
            if (number > 0) {
                positivePercent++;
            }
            else if (number < 0) {
                negativePercent++;
            }
            else {
                nullPercent++;
            }
        }
        System.out.println(positivePercent / array.size());
        System.out.println(negativePercent / array.size());
        System.out.println(nullPercent / array.size());
    }
    public static void main(String[] args) {
        List<Integer> listOfNumbers = List.of(
                1, 5, 2, 8, -2, -7, -62, 0, 0, -5
        );

        plusMinus(listOfNumbers);
    }
}
