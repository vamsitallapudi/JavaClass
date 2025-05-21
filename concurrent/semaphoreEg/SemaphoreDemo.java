package concurrent.semaphoreEg;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {

        System.out.println("Total threads on this system: " + Runtime.getRuntime().availableProcessors());
        Semaphore s = new Semaphore(1);
        new Thread(new IncThread(s)).start();
        new Thread(new DecThread(s)).start();

    }
}
