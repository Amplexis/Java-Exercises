public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        int [] numbers = {number1, number2, number3};
        int [] lastDigits = {0, 0, 0};

        int lastDigit = 0;
        for (int i=0; i < numbers.length; i++) {
            if (isValid(numbers[i])) {
                lastDigit = numbers[i] % 10;
                lastDigits[i] = lastDigit;
            } else {
                return false;
            }
        }
        if ((lastDigits[0] == lastDigits[1] || lastDigits[0] == lastDigits[2]) || (lastDigits[1] == lastDigits[2])) return true;
        return false;
    }
    public static boolean isValid (int number) {
        if (number < 10 || number > 1000) return false;
        return true;
    }
}
