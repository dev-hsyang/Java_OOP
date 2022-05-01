package myLinkedList;
//Lab 3, 2022.03.22

public class Assign2TestClass {

    public static void main(String[] args){

        LinkedList list = new LinkedList();
        System.out.println("insert (5, 100)");
        if(!list.insert(5,100))
            System.out.println("fail to insert (5, 100)");
        System.out.println("insert (7, 29)");
        if(!list.insert(7,29))
            System.out.println("fail to insert (7, 29)");
        System.out.println("insert (2, 60)");
        if(!list.insert(2,60))
            System.out.println("fail to insert (2, 60)");
        System.out.println("insert (7, 80)");
        if(!list.insert(7,80))
            System.out.println("fail to insert (7, 80)");
        list.print();

        System.out.println("delete (7, 29)");
        if(!list.delete(7))
            System.out.println("fail to delete (7, 29)");
        list.print();
    }
}
