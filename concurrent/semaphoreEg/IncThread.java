package concurrent.semaphoreEg;

import java.util.concurrent.Semaphore;

public class IncThread implements Runnable{

    Semaphore s;

    public IncThread( Semaphore s) {
        this.s = s;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Starting " + threadName);
        try {
            System.out.println(threadName + " is waiting for a permit");
            s.acquire();
            System.out.println(threadName + " gets permit");
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(threadName + ": " + Shared.count);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadName + " releases the permit.");
        s.release();
    }
}
