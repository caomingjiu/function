package zeng.demo;

/**
 * @author Zeng
 * @ClassName GreetingService
 * @Description Greet抽象类
 * @Date 2020/2/22
 * @Version 1.0
 **/
@FunctionalInterface
public interface GreetingService {
    void sayMessage(String call, String message);
}
