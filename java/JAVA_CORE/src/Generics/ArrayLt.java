package Generics;

import java.util.ArrayList;

public class ArrayLt {
    static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Rohit");
        a.add("Kumar");
        a.add("choubey");
        String s = a.get(0);
        System.out.println(s);
        ArrayLt ar=new ArrayLt();
        Integer[] ab ={1,2,3,4,5,6};
        ar.printsArray(ab);
        Integer t=5;
        Integer e=5;
        Integer f= new Integer(5);
        System.out.println(t==e);
        System.out.println(t.equals(e));
        System.out.println(t==f);
        System.out.println(t.equals(f));
        int x=10;
        Integer in=Integer.valueOf(x);
        int u= in.intValue();
    }

        public <T> void printsArray(T[] array){
            for(T element: array){
                System.out.print(element+ " ");
            }
            System.out.println();

        }

    }


