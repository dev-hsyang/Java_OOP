package myStringArrayList;

import java.awt.desktop.SystemEventListener;

public class StringArrayList {

    private ListNode headNode = null;
    private ListNode lastNode = null;
    int size = 0;
    int index = 0;

    public void add(String val){
        ListNode newnode = new ListNode();
        newnode.setValue(val);
        newnode.setIndex(index);

        if(headNode != null){
            lastNode.setNext(newnode);
            lastNode = newnode;
        }
        else {
            headNode = newnode;
            lastNode = newnode;
        }
        size++;
        index++;
    }

    public boolean insert(int index, String val){
        ListNode newnode = new ListNode();
        newnode.setIndex(index);
        newnode.setValue(val);
        if(index<0||index>size)
            return false;
        if (index == 0) {
            for (ListNode node = headNode; node != null; node = node.getNext()) {
                node.setIndex(node.getIndex() + 1);
            }
            newnode.setNext(headNode);
            headNode = newnode;
            size++;
            this.index++;
            return true;
        } else {
            for (ListNode node = headNode; node != null; node = node.getNext()) {
                if (node.getIndex() == index-1) {
                    for (ListNode pNode = node.getNext(); pNode != null; pNode = pNode.getNext()) {
                        pNode.setIndex(pNode.getIndex() + 1);
                    }
                    newnode.setNext(node.getNext());
                    node.setNext(newnode);
                    size++;
                    this.index++;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean remove(int index){
        ListNode node = headNode;
        ListNode preNode = null;

        if(headNode == null)
            return false;
        if(headNode.getNext() == null){
            headNode = null;
            size--;
            this.index = 0;
            return true;
        }
        for(;node.getNext() != null;){

            if(node.getIndex() == index){
                preNode.setNext(node.getNext());
                node.setNext(null);
                for(node= preNode.getNext(); node!=null; node=node.getNext()){
                    node.setIndex(node.getIndex()-1);
                }
                size--;
                this.index--;
                return true;
            }
            preNode = node;
            node = node.getNext();
        }
        return false;
    }

    public String get(int index){
        if(size==0||index<0)
            return null;
        for(ListNode node = headNode; node != null; node = node.getNext()){
            if(node.getIndex() == index){
                return node.getValue();
            }
        }
        return null;
    }

    public void set(int index, String val){
        for(ListNode node = headNode; node!=null; node=node.getNext()){
            if(node.getIndex()==index){
                node.setValue(val);
                return;
            }
        }
        return;
    }

    public boolean contains(String val){
        for(ListNode node = headNode; node!=null; node=node.getNext()){
            if(node.getValue()==val)
                return true;
        }
        return false;
    }

    public int indexOf(String val){
        for(ListNode node = headNode; node!=null; node=node.getNext()){
            if(node.getValue()==val)
                return node.getIndex();
        }
        return -1;
    }

    public int size(){
        return size;
    }

    public void println(){
        for(ListNode node = headNode; node!=null; node=node.getNext()){
            System.out.print(" " + node.getValue());
        }
        System.out.println(" ");
    }

    public void printIndex(){
        for(ListNode node = headNode; node!=null; node=node.getNext()){
            System.out.print(node.getIndex());
        }
        System.out.println(" ");
    }
}
