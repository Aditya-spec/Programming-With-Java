package Question_Thirteen;
//Coordinate multiple threads using wait() and notifyAll().

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) throws InterruptedException {
        final Producer_Consumer pc = new Producer_Consumer();

        Thread t1=new Thread(()->{
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t3=new Thread(()->{
            try {
                pc.produce2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });




        Thread t2=new Thread(()->{
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t3.start();
        t2.start();


        t1.join();
        t3.join();
        t2.join();
    }


    public static class Producer_Consumer {

        public void produce()throws InterruptedException {
                      synchronized(this)
            {
                System.out.println("Producer1  is running");
                wait();
                System.out.println("Producer1  is resumed");
            }
        }
        public void produce2()throws InterruptedException {
            synchronized(this)
            {
                System.out.println("Producer2  is running");
                wait();
                System.out.println("Producer2  is resumed");
            }
        }



        public void consume()throws InterruptedException {
            Thread.sleep(2000);
            Scanner s = new Scanner(System.in);
            synchronized(this)
            {
                System.out.println("Press the return key to resume producer");
                s.nextLine();
                System.out.println("Return key pressed, Producers are resuming");
                notifyAll();
                System.out.println("notifying all the threads");

            }
        }
    }
}