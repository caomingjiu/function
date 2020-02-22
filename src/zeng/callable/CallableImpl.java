package zeng.callable;

import java.util.concurrent.Callable;

/**
 * @author Zeng
 * @ClassName CallableImpl
 * @Description TOOD
 * @Date 2020/2/22
 * @Version 1.0
 **/
public class CallableImpl implements Callable {
    private String name;

    public CallableImpl(String name) {
        this.name = name;
    }

    @Override
    public Object call() throws Exception {
        System.out.println("调用Callable的call()方法进行逻辑处理开始！");
        //call()方法执行完后返回的数据
        return name;
    }

}
