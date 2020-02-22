package zeng.demo;

/**
 * @author Zeng
 * @ClassName GreetingServiceTest
 * @Description 测试类
 * @Date 2020/2/22
 * @Version 1.0
 **/
public class GreetingServiceTest {
    public static void main(String[] args) {
        GreetingService greetingService = (call, message) -> {
            System.out.println(call +","+ message);
        };
        greetingService.sayMessage("大伯", "早上好");
    }
}
