package collectionFramework;

import java.util.LinkedList;

import static java.util.Collections.sort;

public class LinkedList1 {
    static void main(String[] args) {
        LinkedList<Integer> myList=new LinkedList<>();
        myList.add(4);
        myList.add(5);
        myList.add(29);
        myList.addFirst(2);
        sort(myList);
        myList.removeIf(x->x%2==0);
        System.out.println(myList);

        }


    }



