import java.util.*;

public class guessnum {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        int minRange = 1;
        int maxRange = 100;
        int attempts = 5;
        int score = 0;

        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int remainingAttempts = attempts;

            System.out.println("\n you can selected a number between " + minRange + " and2 " + maxRange + ".");
            System.out.println("You have " + remainingAttempts + " chance to guess it.");

            int guess;
            boolean guessedCorrectly = false;

            while (remainingAttempts > 0 && !guessedCorrectly) {
                System.out.print("Enter your guess number: ");
                guess = scanner.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    guessedCorrectly = true;
                    score += remainingAttempts;
                    
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                remainingAttempts--;
            }

            if (!guessedCorrectly)
             {
                System.out.println("Sorry, you've run out of attempts. The number was: " + randomNumber);
             }

            System.out.println("Your score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next();

            playAgain = playChoice.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}