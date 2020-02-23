package Guan.Dome;

import hyj.GreatingService;
import zeng.demo.GreetingService;

public class GreetingServiceTest {
    public static void main(String[] args) {
        GreetingService greetingService = (message ,call) -> {
            System.out.println(call +","+ message);
        };
        greetingService.sayMessage("老师","早上好");
    }
}