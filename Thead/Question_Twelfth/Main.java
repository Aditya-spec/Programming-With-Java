package Question_Twelfth;
//Use Atomic Classes instead of Synchronize method and blocks.
public class Main {
    public static void main(String[] args) {
        Value value=new Value();
        Thread t1=new Thread(()->{
            for(int i=0;i<100;i++)
            value.increment();

                System.out.println(value.get());
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<100;i++)
                value.decrement();
            System.out.println(value.get());
        });
        t1.start();
        t2.start();

    }
}
