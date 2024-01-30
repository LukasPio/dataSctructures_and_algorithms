import java.security.SecureRandom;

public class Matriz {
    public static void main(String[] args) {

        final int totalOfRow = 3;
        final int totalOfColumn = 5;
        int[][] matrix = new int[totalOfRow][totalOfColumn];

        for (int row = 0; row < totalOfRow; row++) {
            for (int column = 0; column < totalOfColumn; column++) {
                matrix[row][column] = new SecureRandom().nextInt(100);
            }
        }

        for (int row = 0; row < totalOfRow; row++) {
            for (int column = 0; column < totalOfColumn; column++) {
                System.out.printf("%d " ,matrix[row][column]);
            }
            System.out.printf("%n");
        }


    }
}
