package myLinkedList;
//Lab 3, 2022.03.22

public class LinkedList {
    private Node mData = null;
    private int mSize = 0;

    public boolean insert(int key, double value){
        Node newnode = new Node();
        newnode.setKey(key);
        newnode.setmValue(value);

        if(mData != null){
            Node lastnode = mData;
            for( ; lastnode.getmNext() != null ; lastnode = lastnode.getmNext()){
                if (lastnode.getmKey() == key)
                    return false;
            }
            if (lastnode.getmKey() == key)
                return false;
            lastnode.setmNext(newnode);
        }
        else {
            mData = newnode;
        }
        mSize++;
        return true;
    }

    public boolean delete(int key){
        Node node = mData;
        Node preNode = null;

        if(mData == null) //empty list
            return false;
        if(mData.getmNext() == null){ //list with one node
            mData = null;
            mSize--;
            return true;
        }
        for(;node.getmNext() != null;){
            if(node.getmKey() == key){ // first node of the list
                //System.out.println(node.getmKey());
                mData = node.getmNext();
                node.setmNext(null);
                mSize--;
                return true;
            }
            preNode = node;
            node=node.getmNext();
            if(node.getmKey() == key){
                preNode.setmNext(node.getmNext());
                node.setmNext(null);
                mSize--;
                return true;
            }
        }
        return false;
    }

    public void print(){
        System.out.println("List: " + mSize + " elements");
        for(Node node = mData; node != null; node = node.getmNext()){
            System.out.println("    (" + node.getmKey() + "," + node.getmValue() + ")");
        }
    }
}
