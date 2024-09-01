import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 5;
        int score = 0;
        String playAgain;

        do {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Number Guessing Game Session!");
            System.out.println("---------------------------------");
            System.out.println("YOU CAN TRY TO GUESS THE NUMBER BETWEEN 1 TO 100:");
            System.out.println("---------------------------------------------------");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess number: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You've guessed the correct number!");
                    score++;
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry,you don't have more  attempts. The correct number was: " + randomNumber);
            }

            System.out.print("If you want to play again then Enter yes other wise No:(yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Game over! Your final score is: " + score);
        scanner.close();
    }
}
