package myLinkedList;
//Lab 3, 2022.03.22

public class Node {
    private Node mNext = null;
    private int mKey = 0;
    private double mValue = 0;

    public void setmNext(Node node){
        mNext = node;
    }

    public Node getmNext(){
        return mNext;
    }

    public void setKey(int key){
        mKey = key;
    }

    public int getmKey(){
        return mKey;
    }

    public void setmValue(double val){
        mValue = val;
    }

    public double getmValue(){
        return mValue;
    }
}
