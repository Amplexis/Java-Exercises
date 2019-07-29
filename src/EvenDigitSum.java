public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum (int number) {
        if (number < 0) return -1;
        int numberToCheck = 0;
        int sumOfEvenNumbers = 0;
        while (number > 0) {
            numberToCheck = number % 10;
            if (numberToCheck % 2 == 0) sumOfEvenNumbers += numberToCheck;
            number = number / 10;
        }
        return sumOfEvenNumbers;
    }
}
