package Tao;

/**
 * @author Tao
 */
public class DefaultMethod {
    public interface Chinese{

        default String speak(){
            return "会说普通话";
        }

        default String speak(String language){
            return "会说" + language;
        }

        static void say(){
            System.out.println("我不告诉你");
        }
    }

    public interface GuangDong extends Chinese{
        @Override
        default String speak(){
            return "粤语";
        }
    }

    public interface Mayun extends Chinese{
        @Override
        String speak();
    }

    public static void main(String[] args) {
        System.out.println(new Chinese() {
            @Override
            public String speak() {
                return null;
            }
        });
    }
}
