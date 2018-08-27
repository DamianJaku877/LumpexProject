package AtomicInteger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class App2 {
    public static void main(String[] args){

        AtomicInteger atomicInteger = new AtomicInteger(0);
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream.range(0,10).forEach(i -> executorService.submit(atomicInteger::incrementAndGet));

        executorService.shutdown();

        System.out.println(atomicInteger.get());
    }
}
