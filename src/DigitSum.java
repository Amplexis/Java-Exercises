public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(298));
        System.out.println(sumDigits(6));
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
