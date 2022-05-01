package myStringArrayList;

import java.lang.invoke.VarHandle;
import java.time.temporal.ValueRange;

public class ListNode {
    private ListNode next = null;
    private String value = null;
    private int index = 0;

    public void setNext(ListNode node){
        next = node;
    }

    public ListNode getNext(){
        return next;
    }

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex(){
        return index;
    }
}
