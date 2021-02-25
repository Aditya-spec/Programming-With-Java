package Question_Fourth;
//Try shutdown() and shutdownNow() and observe the difference.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
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
        executorService.shutdown();
        executorService.execute(()->{
//This will give the exception(RejectedExecutionException) as this task will be rejected.

            for(int i=0;i<5;i++){
                System.out.println("Thread-3");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        });
    }
}
