package Hackerrank;

public class TimeConversion {

    public static String formatHourMinuteSecond(int hourMinuteOrSecond) {
        if (hourMinuteOrSecond >= 10) { return String.valueOf(hourMinuteOrSecond); }
        return "0" + String.valueOf(hourMinuteOrSecond);
    }

    public static String dateFormater(String date) {

        String modificator = date.substring(date.length() - 2);

        int hours = Integer.parseInt(date.substring(0, 2));
        int minutes = Integer.parseInt(date.substring(3, 5));
        int seconds = Integer.parseInt(date.substring(6, 8));

        if (modificator.equals("PM") && hours < 12) {
            hours += 12;
        }
        if (modificator.equals("AM") && hours >= 12) {
            hours -= 12;
        }

        return formatHourMinuteSecond(hours) + ":"
                + formatHourMinuteSecond(minutes) + ":"
                + formatHourMinuteSecond(seconds);
    }

    public static void main(String[] args) {
    // PM tem que somar 12 nas horas e Am subtrair
        String date = "06:30:00PM";
        System.out.println(dateFormater(date));;
    }
}
