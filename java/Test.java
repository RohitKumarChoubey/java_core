public class Test{
    public static void main(String[] args) {
        // int a=5;
        // System.out.println(Integer.toBinaryString(a));//101
        int c =5 & 4;
        System.out.println(c);
        int d =5 | 4;
        System.out.println(d);
        int e =5 ^ 4;
        System.out.println(e);
        System.out.println(!true);
        int f=~e;
        System.out.println(f);
        int g=c <<1;
        System.out.println(g); 
        int h= g>>1;
        System.out.println(h);
    }

}