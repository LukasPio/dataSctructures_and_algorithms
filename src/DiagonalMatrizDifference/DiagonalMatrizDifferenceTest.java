package DiagonalMatrizDifference;

import java.util.List;

public class DiagonalMatrizDifferenceTest {
    public static void main(String[] args) {

        List<List<Integer>> matrizList = List.of(
                List.of(2, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );

        int[][] matrizArray = {
                {2, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(DiagonalMatrizDifferenceDomain.
                calculateDiagnoalDifference(matrizList));

        System.out.println(DiagonalMatrizDifferenceDomain.
                calculateDiagnoalDifference(matrizArray));
    }
}
