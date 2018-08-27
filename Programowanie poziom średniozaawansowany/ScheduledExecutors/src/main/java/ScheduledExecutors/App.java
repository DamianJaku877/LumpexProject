package ScheduledExecutors;

import java.util.concurrent.*;

public class App
{
    public static void main( String[] args ) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("\nScheduling: " + System.nanoTime());
        ScheduledFuture<?> future = executor.schedule(task,5, TimeUnit.SECONDS);

        TimeUnit.MILLISECONDS.sleep(1337);

        long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
        System.out.printf("Remaining Delay: %sms",remainingDelay);
        executor.shutdown();
    }
}
