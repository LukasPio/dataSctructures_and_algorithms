package DiagonalMatrizDifference;

import java.util.List;

public class DiagonalMatrizDifferenceDomain {
    public static int calculateDiagnoalDifference(int[][] matriz) {
        int primaryDiagonal = 0, secondaryDiagonal = 0;

        for (int i = 0; i < matriz.length; i++) {
            primaryDiagonal += matriz[i][i];
            secondaryDiagonal += matriz[i][matriz.length - 1 - i];
        }

        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }

    public static int calculateDiagnoalDifference(List<List<Integer>> matriz) {
        int primaryDiagonal = 0, secondaryDiagonal = 0;

//        {1, 2, 3},
//        {4, 5, 6},
//        {7, 8, 9}

        for (int i = 0; i < matriz.size(); i++) {
            primaryDiagonal += matriz.get(i).get(i);
            secondaryDiagonal += matriz.get(i).get(matriz.size() - 1 - i);
        }

        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }
}
