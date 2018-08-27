package PingResult;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App
{
        //http://www.javapractices.com/topic/TopicAction.do?Id=247
        public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<PingResult>> results = executor.invokeAll(Arrays.asList(
                new Ping("https://www.wp.pl/"),
                new Ping("https://www.onet.pl/"),
                new Ping("http://cdn.wonderfulengineering.com/wp-content/uploads/2014/03/high-resolution-wallpapers-1.jpg"),
                new Ping("https://www.facebook.com/")
        ));
        for (Future<PingResult> task : results) {
            System.out.println(task.get());        }
//        try {
//            System.out.println(task.get());
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
        executor.shutdown();
    }
}
