import java.util.Random;
import java.util.Scanner;

public class NumberGameLogic {
    private int guessAttempts;
    private int randomNumber;
    private int userNumberChoice;
    private static Scanner scanner;

    public NumberGameLogic(int guessAttempts) {
        this.guessAttempts = guessAttempts;
        this.randomNumber = new Random().nextInt(100) + 1;
        this.scanner = new Scanner(System.in);
    }

    public int getGuessAttempts() {
        return this.guessAttempts;
    }

    public int getRandomNumber() {
        return this.randomNumber;
    }

    public int getUserNumberChoice() {
        return this.userNumberChoice;
    }

    public void setGuessAttempts(int guessAttempts) {
        this.guessAttempts = guessAttempts;
    }

    public void setUserNumberChoice(int userNumberChoice) {
        this.userNumberChoice = userNumberChoice;
    }

    public void play() {

        System.out.println("");
        System.out.println("A number between 1 - 100 will be chosen");
        System.out.println("You will have " + getGuessAttempts() + " chances to guess the number");

        while (getGuessAttempts() > 0) {
            System.out.print("Guess the number: ");
            setUserNumberChoice(Integer.parseInt(this.scanner.nextLine()));
            setGuessAttempts(getGuessAttempts() - 1);

            if (getUserNumberChoice() == getRandomNumber()) {
                System.out.println("You guessed the correct number!");
                System.out.println("It was the number " + getUserNumberChoice());
                System.out.println("Thanks for playing!");
                return;
            }

            if (getUserNumberChoice() < getRandomNumber()) {
                System.out.println("Your number is lower! Try to guess higher!");
            }

            if (getUserNumberChoice() > getRandomNumber()) {
                System.out.println("Your number is higher! Try to guess lower!");
            }

            System.out.println("");
        }

        System.out.println("You failed to guess the number!");
        System.out.println("The correct number was " + getRandomNumber());
        System.out.println("Thanks for playing!");
    }
}
