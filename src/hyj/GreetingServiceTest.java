package hyj;

public class GreetingServiceTest {
    public static void main(String[] args) {
        GreatingService greetingService =message->{
            System.out.println(message);
            System.out.println(message.substring(2));
        };
        greetingService.sayMessage("函数式编程");
    }
}
