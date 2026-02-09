package INNER_class;

public class Outer {

    void display(){
         int x=20;
        class Inner{
            void info(){
                System.out.println(x);
            }
        }
        Inner in=new Inner();
        in.info();
    }
}
