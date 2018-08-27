package ReadWriteLock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static java.lang.Thread.sleep;

public class App1 {
    public static void main(String [] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(500);
        Map<String,String> map = new HashMap<>();
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        executorService.submit(()-> {
            readWriteLock.writeLock().lock();
            try
            {
                sleep(10000);
                map.put("foo","bar");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                readWriteLock.writeLock().unlock();
            }
        });

        Runnable readTask = () -> {
            readWriteLock.readLock().lock();
            try
            {
                System.out.println(map.get("foo"));
                sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                readWriteLock.readLock().unlock();
            }
        };
        executorService.submit(readTask);
        executorService.submit(readTask);
        executorService.shutdown();
    }
}
