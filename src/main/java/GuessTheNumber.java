import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many times would you like to guess for the number?: ");
        int guessAttempts = Integer.parseInt(scanner.nextLine());


        while (guessAttempts > 0) {
            System.out.print("Guess the number!: ");
            int userNumberChoice = Integer.parseInt(scanner.nextLine());
            guessAttempts--;

            if (userNumberChoice == randomNumber) {
                System.out.println("You guessed the correct number!");
                System.out.println("It was the number " + userNumberChoice);
                System.exit(0);
            }

            if (userNumberChoice < randomNumber) {
                System.out.println("Your number is lower! Try to guess higher!");
            }

            if (userNumberChoice > randomNumber) {
                System.out.println("Your number is higher! Try to guess lower!");
            }
            System.out.println("");
        }
    }
}
