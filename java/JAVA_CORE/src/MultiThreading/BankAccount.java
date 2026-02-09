package MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance=100;

    private final Lock lock=new ReentrantLock();

    public void withdraw(int amount)  {
        System.out.println(Thread.currentThread().getName() + "attemptong to withdraw "+ amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){

            }

        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
