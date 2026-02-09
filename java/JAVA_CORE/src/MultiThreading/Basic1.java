package MultiThreading;

public class Basic1 {
        int x = 10;

        static void change(Basic1 d) {
            d.x = 20;
        }

        public static void main(String[] args) {
            Basic1 obj = new Basic1();
            change(obj);
            System.out.println(obj.x);
        }
    }


