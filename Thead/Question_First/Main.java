package Question_First;
//Create and Run a Thread using Runnable Interface and Thread class.
class Thread_Example extends Thread{
    @Override
    public void run() {
        System.out.println("Extended Thread ");
   }
}

public class Main {
    public static void main(String[] args) {

/*
 Runnable runner=()->{
     System.out.println("Runnable Thread");
 };
*/
        Thread t2=new Thread(()->{
            System.out.println("Runnable Thread");
        });
        Thread_Example t1=new Thread_Example();
        t2.start();
        t1.start();

    }
}
