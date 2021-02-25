package Question_Ninth;
//Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
    Thread task=new Thread(()->{
      //  for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
    //    }
    }
    });
        ExecutorService executorService= Executors.newCachedThreadPool();
        for (int i=0;i<8;i++){
            executorService.submit(task);
        }//New threads will be created as when required.
        executorService.shutdown();
    }
}
