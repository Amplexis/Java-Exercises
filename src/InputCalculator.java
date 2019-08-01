import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        /*
        Write a method called inputThenPrintSumAndAverage that does not have any parameters.

        The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.

        When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

        XX represents the sum of all entered numbers of type int.
        YY represents the calculated average of all numbers of type long.
         */
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = 0;
        int sum = 0;
        long average = 0;

        while (true) {
            System.out.println("Enter a number");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                numberOfInputs += 1;
                sum += number;
            } else {
                break;
            }
            scanner.nextLine(); // deal with return issue
        }
        scanner.close();
        average = sum / numberOfInputs;
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
