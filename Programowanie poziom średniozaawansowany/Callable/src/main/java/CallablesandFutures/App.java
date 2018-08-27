package CallablesandFutures;

import java.util.concurrent.*;

public class App
{
    public static void main( String[] args ) throws ExecutionException, InterruptedException, TimeoutException {
        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(task);
        System.out.println("future done? " + future.isDone());
        Integer result = future.get(5, TimeUnit.SECONDS);
        System.out.println("future done? " + future.isDone());
        System.out.print("result: " + result);
    }
}
