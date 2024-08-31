import java.util.Scanner;

public class IT24102344Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to hold 10 numbers
        int[] numbers = new int[10];
        
        // Prompt user to enter 10 numbers
        System.out.println("Please enter 10 numbers:");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Close the scanner
        scanner.close();
        
        // Print the entered numbers
        System.out.println("\nThe numbers you entered are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }
}
