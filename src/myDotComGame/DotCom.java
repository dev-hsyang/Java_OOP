package myDotComGame;

import java.util.*;

import java.util.ArrayList;

public class DotCom {
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
            } // close if
        } // close if
        return result;
    } // close method


    public void setName(String n) {
        name = n;
    }

    public String getName(){
        return name;
    }

}