package Question_Fourteen;
//Coordinate mulitple threads using wait() and notifyAll()
import java.util.Scanner;

class Processor5 {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("\nRunning Producer Thread...");
            wait();
            System.out.println("Thread Resumed..");
        }
    }

    public void consume() throws InterruptedException {

        Thread.sleep(2000);
        synchronized (this) {
            System.out.println("Press a key to continue...");
            new Scanner(System.in).nextLine();
            System.out.println("Key pressed..");
            notifyAll();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Processor5 obj1 = new Processor5();
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    obj1.produce();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        },"First");
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    obj1.produce();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        },"Second");

        Thread t3 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    obj1.consume();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All thread notifed");


    }
}
