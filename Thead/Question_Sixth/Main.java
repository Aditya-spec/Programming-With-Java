package Question_Sixth;
//Return a Future from ExecutorService by using callable and
// use get(), isDone(), isCancelled() with the Future object
// to know the status of task submitted.
import java.util.concurrent.*;

class SumCallable implements Callable<Integer>{
    private int input;
    public SumCallable(int input){
        this.input=input;
    }
    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        int sum=0;
        for (int i=0;i<input;i++)
            sum+=i;
        return sum;
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Future<Integer> future=executorService.submit(new SumCallable(10));
        Thread.sleep(3000);
        if(future.isDone())
            System.out.println(future.get());
        System.out.println(future.isCancelled());

        executorService.shutdown();
        System.out.println("Main Thread");

    }
}
