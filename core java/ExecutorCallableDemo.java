import java.util.concurrent.*;
public class ExecutorCallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService e = Executors.newFixedThreadPool(1);
        Future<String> f = e.submit(()->"Done");
        e.shutdown();
    }
}
