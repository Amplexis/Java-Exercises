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
                scanner.nextLine(); // Handle next line return issue
                sum += number;
                numberCount += 1;
            }
        }
        scanner.close();
        System.out.println("The sum of your numbers is " + sum);
    }
}
