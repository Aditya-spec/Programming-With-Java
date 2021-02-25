package Question_Sixteen;
//Create a deadlock and Resolve it using tryLock().
//Part First-> Creating a  deadlock
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Runner {
    private Lock lock1=new ReentrantLock();
    private Lock lock2=new ReentrantLock();
    Random random=new Random();

public void Add(){
    for (int i=0;i<20000;i++){
    lock1.lock();
    lock2.lock();
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
    lock2.lock();
    lock1.lock();
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

public class Main {
    public static void main(String[] args) {
Runner runner=new Runner();
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
