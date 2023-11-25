public class Factorial {
    public static void main(String[] args) {

        int numberToFactorial = 6;
        int aux = numberToFactorial - 1;
        for (; aux > 0; aux--) {
            numberToFactorial *= aux;
        }
        System.out.println(numberToFactorial);
    }
}
