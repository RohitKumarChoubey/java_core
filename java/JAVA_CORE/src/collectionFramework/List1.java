package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class List1 {
    static void main(String[] args) {
//        ArrayList<Integer> l=new ArrayList<>();
//        l.add(1);
//        l.add(2);
//        l.add(3);
//        l.add(4);
//        System.out.println(l.get(2));
//        System.out.println(l.size());
//        for(int i:l){
//            System.out.println(i);
//        }
//        System.out.println(l.contains(3));
//        System.out.println(l.contains(5));
//        l.remove(2);
//        l.add(1,20);//it dynamically add to index 1 by shifting all elements;
//        l.set(1,30);//it replaces index 1 with new value 30
//        for(int i=0;i<l.size();i++){
//            System.out.println(l.get(i));
//        }
//
//        ArrayList<Integer> m=new ArrayList<>();
//        m.add(4);
//        m.add(3);
//        m.add(2);
//          m.sort(new Mycomparator());
//        System.out.println(m);


        List<String> my = Arrays.asList("ok", "bye", "Rohit", "s");
        System.out.println(my);
        my.sort(new Mycomparator1());
        System.out.println(my);
    }




}
//class Mycomparator implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer m, Integer n) {
//        return n-m; //descending order
//    }
//}
class Mycomparator1 implements Comparator<String>{

    @Override
    public int compare(String m, String n) {
        return m.length()-n.length();
    }
}