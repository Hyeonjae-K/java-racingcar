public class Application {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.initGame();
        racingGame.start();
        racingGame.printResult();
    }
}
