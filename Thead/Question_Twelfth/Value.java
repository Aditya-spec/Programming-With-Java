package Question_Twelfth;

import java.util.concurrent.atomic.AtomicInteger;

public class Value {
    private AtomicInteger value = new AtomicInteger();

    public void increment() {
        for (int i=0;i<100;i++)
       value.incrementAndGet();

    }

    public void decrement() {
        for (int i=0;i<100;i++)
        value.decrementAndGet();
    }

    public int get() {
        return value.get();
    }
}
