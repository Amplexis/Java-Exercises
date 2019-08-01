import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 1;
        int sum = 0;
        while (numberCount <= 10) {

            System.out.println("Enter number #" + numberCount);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                numberCount += 1;
            } else {
                System.out.println("An invalid number was entered. Please try again.");
            }
            scanner.nextLine(); // Handle next line return issue
        }
        scanner.close();
        System.out.println("The sum of your numbers is " + sum);
    }
}
