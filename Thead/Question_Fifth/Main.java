package Question_Fifth;
//Q5)Use isShutDown() and isTerminated() with ExecutorService.
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()->{
            for(int i=0;i<5;i++){
                System.out.println("Thread-1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.execute(()->{
            for(int i=0;i<5;i++){
                System.out.println("Thread-2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("Is shutdown before calling shutdown():"+ executorService.isShutdown());
        executorService.shutdown();
        System.out.println("Is shutdown after calling shutdown():"+executorService.isShutdown());
//Next statement will give false as the submitted tasks will stil be executing
        System.out.println("Before Sleep:"+executorService.isTerminated());
        Thread.sleep(7000);
//Next statement will give true as all the tasks would be executed after 7 seconds.


        System.out.println("After  Sleep:"+executorService.isTerminated());
    }
}
