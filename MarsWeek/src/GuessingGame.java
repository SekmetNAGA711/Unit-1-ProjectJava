import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
     String playerName;
     int number;
      int guesses;

    // Constructor
    public GuessingGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the game!");

        System.out.print("Please enter your name: ");
        playerName = input.nextLine();
        System.out.println("Welcome to the game, " + playerName + "!");

        System.out.println("Let's begin " + playerName + ", I'm thinking of a number between 1-100.");
        System.out.println("Can you guess what it is?");
        Random rand = new Random();
        number = rand.nextInt(100) + 1;
        guesses = 0;
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame(); // Create an instance of GuessingGame
        game.playGame(); // Start the game
    }

    // Method to play the game
    public void playGame() {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter your guess: ");
                int guess = input.nextInt();
                guesses++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Invalid input. Please enter a number between 1 and 100.");
                } else if (guess < number) {
                    System.out.println("Your guess is low, try again.");
                } else if (guess > number) {
                    System.out.println("Your guess is too high, try again.");
                } else {
                    System.out.println("Well done, " + playerName + "!");
                    System.out.println("You found my number in " + guesses + " tries!");
                    break;
                }
            } catch (java.util.InputMismatchException error) {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.next(); // Clear the invalid input
            }
        }
    }
}
