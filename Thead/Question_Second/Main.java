package Question_Second;
//Use sleep and join methods with thread.
public class Main {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            System.out.println("Counting till 100");
           for (int i =0;i<100;i++){
               System.out.println(i+1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           }
        });
       t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counting ends");//if we remove t.join them this line will
                                           // be printed earlier and not in the end.

    }

}
