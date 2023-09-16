import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int storedNumber = random.nextInt(100) + 1; 
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        do {
            System.out.print("Please enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < storedNumber) {
                System.out.println("The stored number is greater than " + guess);
            } else if (guess > storedNumber) {
                System.out.println("The stored number is smaller than " + guess);
            } else {
                System.out.println("Congratulations! You have found the stored number " + storedNumber);
                System.out.println("It took you " + attempts + " attempts.");
            }
        } while (guess != storedNumber);

        scanner.close();
    }
}

