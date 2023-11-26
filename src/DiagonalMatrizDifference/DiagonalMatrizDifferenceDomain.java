package DiagonalMatrizDifference;

import java.util.List;

public class DiagonalMatrizDifferenceDomain {
    public static int calculateDiagnoalDifference(int[][] matriz) {
        int matrizSize = matriz.length;
        int primaryDiagonal = 0, secondaryDiagonal = 0;
        int column = 0;
        for (int i = 1; i < matrizSize; i++) {
            primaryDiagonal += matriz[i][column];
            secondaryDiagonal += matriz[i][matriz[0][0] - 1 - column];
            column++;
        }

        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }

    public static int calculateDiagnoalDifference(List<List<Integer>> matriz) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < matriz.size(); i++) {
            primaryDiagonal = matriz.get(i).get(i);
            secondaryDiagonal = matriz.get(i).get(matriz.size() - 1 - i);
        }

        return primaryDiagonal - secondaryDiagonal;
    }
}
