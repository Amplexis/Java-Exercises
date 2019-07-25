public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    private static final int CONVERSION_VALUE = 60;

    public static void main(String[] args) {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(65, 9));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(456));

    }

    public static String getDurationString(int minutes, int seconds) {
        if  ((minutes < 0) || (seconds < 0) || (seconds > 59)) return INVALID_VALUE_MESSAGE;

        int hours = minutes / CONVERSION_VALUE;
        int remainingMinutes = minutes % CONVERSION_VALUE;

        String stringHours = Integer.toString(hours);
        String stringMinutes = Integer.toString(remainingMinutes);
        String stringSeconds = Integer.toString(seconds);

        if (stringHours.length() == 1) stringHours = ("0" + stringHours);
        if (stringMinutes.length() == 1) stringMinutes = ("0" + stringMinutes);
        if (stringSeconds.length() == 1) stringSeconds = ("0" + stringSeconds);

        String result = (stringHours + "h " + stringMinutes + "m " + stringSeconds + "s");
        return result;

    }

    public static String getDurationString(int seconds) {
        if(!(seconds >= 0)) return "Invalid value";

        int minutes = seconds / CONVERSION_VALUE;
        int remainingSeconds = seconds % CONVERSION_VALUE;

        return getDurationString(minutes, remainingSeconds);
    }
}
