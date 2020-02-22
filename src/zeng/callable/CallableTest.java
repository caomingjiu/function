package zeng.callable;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author Zeng
 * @ClassName CallableTest
 * @Description 测试类
 * @Date 2020/2/22
 * @Version 1.0
 **/
public class CallableTest {
    public static void main(String[] args) {
        //使用main方法模拟Callable的call()方法的调用
        CallableImpl callableImpl = new CallableImpl("我是阿Z");
        //创建一个可根据需要创建新线程的线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        System.out.println("开始执行call()方法!");
        //Future 表示异步计算的结果。它提供了检查计算是否完成的方法，以等待计算的完成，并获取计算的结果。计算完成后只能使用 get 方法来获取结果
        Future future = executorService.submit(callableImpl);
        try {
            System.out.println("这里测试一下程序的执行");
            System.out.println("调用call()方法返回的结果：" + future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

}
