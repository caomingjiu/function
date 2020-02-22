package Tao;

public class GreetingServiceTest {
    public static void main(String[] args) {
        GreetingService greetingService = (message,age) -> {
            System.out.println(age + "岁的人,问好:" + message);
            System.out.println(message.substring(2));
        };
        greetingService.sayMessage("hello world",32);
    }
}
