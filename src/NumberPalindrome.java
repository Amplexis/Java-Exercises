public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(91881));
    }
    public static boolean isPalindrome (int number) {
        // String numberAsString = Integer.toString(number);

        //String number = "10";
        //	int result = Integer.parseInt(number);

        String stringNumber = "";
        int tempInt;

        number = Math.abs(number);
        int copyOfNumber = number;

        while (number > 0) {
            tempInt = number % 10;
            stringNumber += Integer.toString(tempInt);
            number = number / 10;
        }
        number = Integer.parseInt(stringNumber);
        if (number == copyOfNumber) return true;
        return false;

    }

    public static long sumDigits(int number) {
        if (number >= 10) {
            long sumValue = 0;
            while (number > 0) {
                sumValue += number % 10;
                // System.out.println( number % 10);
                number = number / 10;
            }
            return sumValue;
        } else return -1;
    }
}
