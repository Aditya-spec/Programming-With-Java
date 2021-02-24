package Question_Sixteen;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Runner2 {
    private void acquireLocks(Lock firstLock, Lock secondLock){
        boolean gotFirstLock=false;
        boolean gotSecondLock=false;
      while(true){
        try{
            gotFirstLock=firstLock.tryLock();
            gotSecondLock=secondLock.tryLock();
        }finally{
            if(gotFirstLock && gotSecondLock)
                return;
            if(gotFirstLock)
                firstLock.unlock();
            if(gotSecondLock)
                secondLock.unlock();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }}

    }
    private Lock lock1=new ReentrantLock();
    private Lock lock2=new ReentrantLock();
    Random random=new Random();

    public void Add(){
        for (int i=0;i<20000;i++){
            acquireLocks(lock1,lock2);
            try{
                int a= random.nextInt(100);
                int b= random.nextInt(100);

            }finally{
                lock1.unlock();
                lock2.unlock();
            }}
    }

    public void Subtract(){
        for (int i=0;i<20000;i++){
            acquireLocks(lock2,lock1);
            try{
                int a= random.nextInt(100);
                int b= random.nextInt(100);
                System.out.println(a-b);
            }finally{
                lock2.unlock();
                lock1.unlock();
            }
        }}
}

public class Main2 {
    public static void main(String[] args) {
        Runner2 runner=new Runner2();
        Thread t1=new Thread(()->{
            runner.Add();
        });
        Thread t2=new Thread(()->{
            runner.Subtract();
        });
        t1.start();
        t2.start();


    }
}

