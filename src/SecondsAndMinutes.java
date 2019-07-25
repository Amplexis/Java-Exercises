public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(61));

    }

    public static String getDurationString(int minutes, int seconds) {
        if(!(minutes >= 0)) return "Invalid value";
        if(!(seconds >= 0 && seconds <= 59)) return "Invalid Value";

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

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

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
