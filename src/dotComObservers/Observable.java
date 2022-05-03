package dotComObservers;

import java.lang.reflect.Array;
import java.util.ArrayList;

abstract public class Observable {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer){
        this.observers.add(observer);
    }

    public void dettach(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer o : observers){
            o.update();
        }
    }
}
