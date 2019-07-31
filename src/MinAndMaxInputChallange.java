import java.util.Scanner;

public class MinAndMaxInputChallange {
/*
    -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
    -Before the user enters the number, print the message "Enter number:"
    -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
*/
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        boolean firstLoop = true;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter number");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                if (firstLoop) {
                    min = number;
                    max = number;
                    firstLoop = false;
                } else {
                    if (number > max) max = number;
                    if (number < min) min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();  // handle next line return

        }
        System.out.println("Max number was: " + max);
        System.out.println("Min number was: " + min);

    }
}
