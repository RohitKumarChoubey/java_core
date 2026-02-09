package MultiThreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}
