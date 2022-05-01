package myStringArrayList;

import java.util.ArrayList;

public class StringArrayListTest {

    public static void main(String[] args) {
        StringArrayList list = new StringArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println("get() TEST: " + list.get(3));
        //get() TEST: 4
        list.add("6");
        list.add("7");
        list.println();
        //1 2 3 4 5 6 7

        list.insert(0, "0");
        list.println();
        list.insert(5, "55"); //
        list.println();
        //0 1 2 3 4 55 5 6 7

        list.remove(3);
        list.println();
        //0 1 2 4 55 5 6 7

        list.set(3,"33");
        list.println();
        //0 1 2 33 55 5 6 7

        list.add("8");
        list.println();
        //0 1 2 33 55 5 6 7 8
        //list.printIndex();

        if (list.contains("8")) {
            int tempIndex = list.indexOf("8");
            list.set(tempIndex, "9");
        }

        list.println();

        StringArrayList arr = new StringArrayList();
        for(int k=0; k<1000000; k++)
            arr.add(Integer.toString(k));

        //arr.println();

        System.out.println("SYSTEM END");

        //0 1 2 33 55 5 6 7 9

        /*
        다음과 같이 1,000,000개의 String 객체를 StringArrayList에
        추가할 경우에 상당히 많은 시간이 걸리는 것을 알 수 있다.
        StringArrayList arr = new StringArrayList();
        for(int k=0; k<1000000; k++)
            arr.add(Integer.toString(k));

        위와 같이 많은 데이터의 추가를 효율적으로 수행할 수 있도록 실습에서 구현한 StringArrayList를 개선한다.
        */
    }
}
