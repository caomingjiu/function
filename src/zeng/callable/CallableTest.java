package zeng.callable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Zeng
 * @ClassName CallableTest
 * @Description Callable实例：  100个任务各耗时 1 秒，用 10 个线程并行执行。
 * @Date 2020/2/22
 * @Version 1.0
 **/
public class CallableTest {
    public static void main(String[] args) {

        Callable<String> callable = () ->{
            Thread.sleep(1000);
            return Thread.currentThread().getName();
        };

        //创建一个可重用固定线程数的线程池
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //Future 表示异步计算的结果。它提供了检查计算是否完成的方法，以等待计算的完成，并获取计算的结果。计算完成后只能使用 get 方法来获取结果
        List<Future<String>> callableList = new ArrayList<Future<String>>();
        for (int i = 0; i < 100; i++) {
            Future<String> future = executor.submit(callable);
            callableList.add(future);
        }
        //遍历线程情况
        for (Future<String> future : callableList) {
            try {
                System.out.println(LocalDateTime.now() + "::"+ future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //关闭ExecutorService
        executor.shutdown();
    }

}
