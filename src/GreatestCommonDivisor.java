public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }
    public static int getGreatestCommonDivisor (int number1, int number2) {
        int gcd = 0;
        if (number1 < 10 || number2 < 10) return -1;
        int copyNumber1 = number1;
        int copyNumber2 = number2;

        while (copyNumber1 > 0) {
            int result1 = number1 % copyNumber1;
            int result2 = number2 % copyNumber1;
            if (result1 == 0 && result2 == 0) {
                if (copyNumber1 > gcd) gcd = copyNumber1;
            }
            copyNumber1 -= 1;
        }
        while (copyNumber2 > 0) {
            int result1 = number2 % copyNumber2;
            int result2 = number1 % copyNumber2;
            if (result1 == 0 && result2 == 0){
                if (copyNumber2 > gcd) gcd = copyNumber2;
            }
            copyNumber2 -= 1;
        }
        return gcd;
    }
}
