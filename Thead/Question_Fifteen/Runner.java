package Question_Fifteen;
//Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

private int count=0;
private Lock lock=new ReentrantLock();
private Condition cond=lock.newCondition();
private void increment(){
    for(int i=0;i<10;i++)
        count++;
}
    private void decrement(){
        for(int i=0;i<10;i++)
            count--;
    }

    public void firstThread(){
    lock.lock();
        try {
            System.out.println("Waiting");
            cond.await();
            System.out.println("Woken up ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try{increment();
        }
    finally {
            System.out.println(count);
        lock.unlock();
    }

    }
    public void secondThread(){
        Scanner scanner=new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.lock();
        System.out.println("enter a key");
        scanner.nextLine();
    try{
        decrement();
    }
    finally {
        System.out.println(count);
        //cond.signal();
        cond.signalAll();
        System.out.println("notified....");
        //we can either use signal() to wake one thread up or signalAll to wake all the threads.
        lock.unlock();
    }
    }
}
