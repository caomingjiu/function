package Tao.Runnable;

/**
 * @author Tao
 */
public class RunnableTest {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i = 0; i <100; i++ ){
                System.out.println(i);
            }
        });
        thread.start();
    }
}
