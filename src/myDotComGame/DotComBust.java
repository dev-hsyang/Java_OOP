package myDotComGame;

import dotComObservers.SurvivingCells;

import java.util.*;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public void setUpGame() {
// first make some dot coms and give them locations
        ShortDotCom one = new ShortDotCom();
        one.setName("Pets.com");
        LongDotCom two = new LongDotCom();
        two.setName("eToys.com");
        HeavyDotCom three = new HeavyDotCom();
        three.setName("Go2.com");
        Submarine four = new Submarine();
        four.setName("Dolphin.com");

        one.attach(new SurvivingCells(one));
        two.attach(new SurvivingCells(two));
        three.attach(new SurvivingCells(three));
        four.attach(new SurvivingCells(four));

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        dotComsList.add(four);
        /*
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        */

        ArrayList<String> newLocation;
        newLocation = helper.placeDotCom(one.size());
        one.setLocationCells(newLocation);
        newLocation = helper.placeDotCom(two.size());
        two.setLocationCells(newLocation);
        newLocation = helper.placeDotCom(three.size());
        three.setLocationCells(newLocation);
        newLocation = helper.placeDotCom(four.size());
        four.setLocationCells(newLocation);
    } // close setUpgame method

    public void startPlaying() {
        while(!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInputRandom("Enter a guess");
            checkUserGuess(userGuess);
        } // close while
        finishGame();
    }
    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for(int x = 0; x < dotComsList.size(); x++) {
            result = dotComsList.get(x).checkYourself(userGuess);
            if (result.equals("hit")) {
                result += " " + dotComsList.get(x).getName();
                break;
            }
            if (result.equals("kill")) {
                result += " " + dotComsList.get(x).getName();
                dotComsList.remove(x);
                break;
            }
        } // close for
        if(!result.equals("miss"))
            System.out.println(result);
    } // close method

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. "+ numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    } // close method

}
