public class Factorial {
    public static void main(String[] args) {

        int numberToFactorial = 6;
        for (int aux = numberToFactorial - 1; aux > 0; aux--) {
            numberToFactorial *= aux;
        }
        System.out.println(numberToFactorial);
    }
}
