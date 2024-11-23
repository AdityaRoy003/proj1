import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Game loop
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            
            try {
                guess = scanner.nextInt(); // Read the user's guess
                attempts++; // Increment the attempt counter

                if (guess < 1 || guess > 100) {
                    System.out.println("Invalid input! Please guess a number between 1 and 100.");
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
