import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numberToGuess = random.nextInt(10) + 1;
        int numberOfAttempts = 0;
        int userGuess = 0;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have randomly selected a number between 1 and 10.");
        System.out.println("Can you guess what it is?");
        
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfAttempts++;
            
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            }
        }
        
        System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + numberOfAttempts + " attempts.");
        
        scanner.close();
    }
}
