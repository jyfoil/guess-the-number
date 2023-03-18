import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        playGuessNumberGame();
    }

    public static void playGuessNumberGame() {
        int randomNumber = new Random().nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("A number between 1 - 100 will be chosen");
        System.out.println("You will have 5 chances to guess the number");

        int guessAttempts = 5;

        while (guessAttempts > 0) {
            System.out.print("Guess the number: ");
            int userNumberChoice = Integer.parseInt(scanner.nextLine());
            guessAttempts--;

            if (userNumberChoice == randomNumber) {
                System.out.println("You guessed the correct number!");
                System.out.println("It was the number " + userNumberChoice);
                return;
            }

            if (userNumberChoice < randomNumber) {
                System.out.println("Your number is lower! Try to guess higher!");
            }

            if (userNumberChoice > randomNumber) {
                System.out.println("Your number is higher! Try to guess lower!");
            }

            System.out.println("");
        }

        System.out.println("You failed to guess the number!");
        System.out.println("The correct number was " + randomNumber);
        System.out.println("Thanks for playing!");
    }
}
