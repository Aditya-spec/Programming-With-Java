package Question_Third;
//Use a singleThreadExecutor to submit multiple threads.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
    private int number;

    public Task(int number){
        this.number=number;

    }
    public void run(){
        System.out.println("Task " + number+" started");
        System.out.println("Hello from the Thread "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task "+number+" ended");

    }
}
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        for (int i=0;i<7;i++){
            executorService.submit(new Task(i));
//Only single thread will complete all the tasks one after the another.
    }
        executorService.shutdown();
    }
}
