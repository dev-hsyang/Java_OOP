package newGuessGame;
//Lab 2, 2022.03.22

public class GuessGame {
    private Player p1;
    private Player p2;

    public void startGame(Player p1, Player p2){
        this.p1 = p1;
        this.p2 = p2;

        this.p1.pickNumber();
        this.p2.pickNumber();


        while (true){
            boolean p2isRight = this.p1.askToGuess(this.p2);
            boolean p1isRight = this.p2.askToGuess(this.p1);
            if(p2isRight){
                System.out.println(this.p2.getName() + " got it right.");
            }
            if(p1isRight){
                System.out.println(this.p1.getName() + " got it right.");
            }
            if(p1isRight || p2isRight)
                break;
        }
    }
}
