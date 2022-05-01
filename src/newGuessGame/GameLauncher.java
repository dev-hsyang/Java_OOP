package newGuessGame;
//Lab 2, 2022.03.22

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        p1.setName("Tom");
        p2.setName("Monica");
        p3.setName("Hyunseung");
        System.out.println("First Game Players are " + p1.getName() + " and " + p2.getName());
        guessGame.startGame(p1, p2);

        System.out.println("Second Game Players are " + p1.getName() + " and " + p3.getName());
        guessGame.startGame(p1, p3);


    }

}
