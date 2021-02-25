package Question_Eight;
//Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()
import java.util.concurrent.*;

public class Main implements Runnable {

    public void run() {
        System.out.print("Java ");
    }

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();


        Runnable task = new Main2();
        int initialDelay = 4;
        int periodicDelay = 2;
scheduler.scheduleWithFixedDelay(task,initialDelay,4,TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(task, initialDelay, periodicDelay,
                TimeUnit.SECONDS);
    }
}