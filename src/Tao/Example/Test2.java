package Tao.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * stream是一种链式操作，很多操作的结束还是一个stream（具体查看方法返回值是否为stream），
 * 你可以继续进行其他流的操作；但是有一些（比如这里的sorted操作，它返回值是void，
 * 但是我们可以通过collect(Collectors.toList()，将其再收集为一个集合，就这样弄来弄去
 * @author Tao
 */
public class Test2 {
    public static void main(String[] args) {
        //以下方法按照长度对字符串集合用stream进行递增排序，然后截断流前5个，再把流转成集合得到结果
        List<String> stringList = new ArrayList<>(Arrays.asList("JavaScript","Java","JavaWeb",
                "SpringFramework","JavaAPI","SpringBoot","JavaEE"));

        List<String> collect = stringList.stream().
                sorted(Comparator.comparingInt(String::length)).limit(5).collect(Collectors.toList());

        System.out.println(collect);
    }
}
