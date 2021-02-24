package Question_Eight;
//Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()
import java.util.concurrent.*;

public class SchedulerClass {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        Runnable task = new Runnable() {
            public void run() {
                System.out.println("Running after a delay via schedule function");
            }
        };

        int delay = 5;
        scheduler.schedule(task, delay, TimeUnit.SECONDS);
        scheduler.shutdown();
    }
        }


