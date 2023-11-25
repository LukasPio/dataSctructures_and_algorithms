import javax.swing.*;

public class Fibonacci {

    static int input (String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, message));
    }

    public static void main(String[] args) {
        int numberToFibonacci = input("Digite o número para fibonacci");
        int numeroAnterior = numberToFibonacci > 1 ? (numberToFibonacci - 1) : 1;
        int maxLength = input("Digite o tamanho do fibonacci");
        int tmp;

        System.out.println(numberToFibonacci);
        for (int i = 0; i < maxLength; i++) {
            System.out.println(numberToFibonacci);
            tmp = numberToFibonacci;
            numberToFibonacci += numeroAnterior;
            numeroAnterior = tmp;
        }
        System.out.println(numberToFibonacci);
    }
}
