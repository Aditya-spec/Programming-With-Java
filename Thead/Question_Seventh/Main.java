package Question_Seventh;
//Submit List of tasks to ExecutorService and
// wait for the completion of all the tasks.
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Process extends Thread{
    private int id;
    CountDownLatch latch;

    public Process(int id,CountDownLatch latch){
        this.id=id;
         this.latch=latch;
    }
    public void run(){

        System.out.println("Thread Started,id:"+id+":"+Thread.currentThread().getName());
        latch.countDown();
    }

}
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        CountDownLatch latch=new CountDownLatch(6);
        for (int i=0;i<6;i++){
            executorService.submit(new Process(i,latch));
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main executed");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
