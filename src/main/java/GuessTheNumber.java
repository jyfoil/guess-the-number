
public class GuessTheNumber {

    public static void main(String[] args) {
        NumberGameLogic firstGame = new NumberGameLogic(5);
        firstGame.play();

        NumberGameLogic secondGame = new NumberGameLogic(10);
        secondGame.play();

    }
}
