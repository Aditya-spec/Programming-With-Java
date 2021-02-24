package Question_Ninth;
//Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        Thread task=new Thread(()->{
           // for (int i=0;i<3;i++){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            //}
        });
        for(int i=0;i<8;i++)
        executorService.submit(task);
    }
    //number of threads will remain fixed
}
