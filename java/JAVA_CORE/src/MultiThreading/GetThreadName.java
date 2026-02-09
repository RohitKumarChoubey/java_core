package MultiThreading;

public class GetThreadName {
    static void main() {
        creatingThread world=new creatingThread();
        System.out.println(world.getState());
        world.start();
        System.out.println(world.getState());
        System.out.println(Thread.currentThread().getName());
    }
}
