package myDotComGame;

public class Submarine extends DotCom {
    boolean underWater = false;

    public int size(){
        return 3;
    }

    @Override
    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            //locationCells.remove(index);
            if(underWater == false) {
                locationCells.remove(index);
                if (locationCells.isEmpty()) {
                    result = "kill";
                    System.out.println("Ouch! You sunk " + getName() + " : ( ");
                } else {
                    result = "hit";
                }
                this.notifyObservers();
            }// close if
            underWater = true;
        } // close if
        else{
            if(underWater==true){
                underWater = false;
            }
        }
        return result;
    }
}
