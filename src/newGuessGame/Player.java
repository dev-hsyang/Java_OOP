package newGuessGame;
//Lab 2, 2022.03.22

public class Player {
    private int number;
    private String name;
    private int myPick;


    public void guess(){
        number = (int)(Math.random()*10);
        System.out.println(name + " is guessing " + number);
    }

    public int getNumber(){
        return number;
    }

    public boolean setName(String name){
        if(name == null) return false;
        this.name = name;
        return true;
    }

    public String getName(){
        return name;
    }

    public void pickNumber(){
        myPick = (int)(Math.random()*10);
        System.out.println(name + " has picked " + myPick);
    }

    public boolean askToGuess(Player theOther){
        theOther.guess();
        int n = theOther.getNumber();
        if(n == myPick){
            return true;
        }
        else
            return false;
    }
}
