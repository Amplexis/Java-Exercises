import java.util.Scanner;

public class ArraySortingChallange {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array.
        
        int[] array = getIntegers(5);
        sortIntegers(array);
        printArray(array);

    }
    public static void sortIntegers(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int ii = i; ii > 0; ii--) {
                if (array[ii] > array[ii-1]) {
                    temp = array[ii];
                    array[ii] = array[ii - 1];
                    array[ii -1] = temp;
                }
            }
        }
    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

}
