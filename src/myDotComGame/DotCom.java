package myDotComGame;

import dotComObservers.Observable;

import java.util.*;

import java.util.ArrayList;

public class DotCom extends Observable {

    protected ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " : ( ");
            } else {
                result = "hit";
            }
            this.notifyObservers();
        }
        return result;
    }


    public void setName(String n) {
        name = n;
    }

    public String getName(){
        return name;
    }

    public ArrayList<String> getState(){
        return (ArrayList<String>) locationCells.clone();
    }

}
