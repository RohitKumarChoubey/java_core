package Generics;

import collectionFramework.List1;

import java.util.List;

public class genericClassExample {
    public <T> void hello(T value){
        System.out.println(value);
    }

    static void main(String[] args) {
        genericClassExample c=new genericClassExample();
        c.hello(123);
        c.hello("Rohit");


    }

}
