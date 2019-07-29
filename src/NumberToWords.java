public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
    }
    public static void numberToWords(int number) {
        int lastDigit;
        int length = getDigitCount(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            number = reversed(number);
            while (number > 0) {
                lastDigit = number % 10;
                number = number /10;
                length -= 1;
                switch(lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }   while (length > 0) {
                System.out.println("Zero");
                length -=1;
            }
        }
    }
    public static int reversed(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
    public static int getDigitCount(int number) {
        if (number <0) return -1;
        int length = 0;
        while (number > 0) {
            length ++;
            number = number / 10;
        }
        return length;
    }
}

