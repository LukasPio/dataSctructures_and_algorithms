import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles (List<Integer> candles) {
        int highestNumber = candles.get(0), candleCount = 0;
        for (int candle: candles) {
            if (candle > highestNumber) highestNumber = candle;
        }
        for (int aCandle: candles) {
            if (aCandle == highestNumber) candleCount++;
        }
        return candleCount;
    }
    public static void main(String[] args) {
        List<Integer> candles = List.of(
                1, 4, 8, 2, 8, 8
        );

        System.out.println(birthdayCakeCandles(candles));
    }
}
