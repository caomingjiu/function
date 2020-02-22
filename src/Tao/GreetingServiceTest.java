package Tao;

public class GreetingServiceTest {
    public static void main(String[] args) {
        GreetingService greetingService = message -> {
            System.out.println(message);
            System.out.println(message.substring(2));
        };
        greetingService.sayMessage("hello world");
    }
}
