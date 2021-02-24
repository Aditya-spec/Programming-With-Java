package Question_Fourth;
//Try shutdown() and shutdownNow() and observe the difference.
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.submit(()->{
            for(int i=0;i<5;i++){
                System.out.println("Thread-1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
//Both of these will throw sleep interrupted execution as shutdown
// now will TRY TO STOP the currently executing tasks,
// although they will keep on executing as the interruption will be handled
        executorService.submit(()->{
            for(int i=0;i<5;i++){
                System.out.println("Thread-2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
       List<Runnable> notexEcutedTasks= executorService.shutdownNow();
    System.out.println("Non Executed Tasks "+ notexEcutedTasks);//it will be empty as no task will be shut down.
    }
}
