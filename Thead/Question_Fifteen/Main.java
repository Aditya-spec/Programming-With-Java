package Question_Fifteen;
//Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().
public class Main {
    public static void main(String[] args)  {
final Runner runner=new Runner();
Thread t1=new Thread(()->{
    runner.firstThread();
});
        Thread t3=new Thread(()->{
            runner.firstThread();
        });
Thread t2=new Thread(()->{
            runner.secondThread();
        });

t1.start();
t3.start();
t2.start();


    }
}
