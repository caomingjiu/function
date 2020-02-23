package Tao.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Tao
 */
public class Test1 {
    public static void main(String[] args) {
        //以下方法按照长度对字符串集合用stream进行递减排序，然后截断流前5个，再把流转成集合得到结果
        List<String> stringList = new ArrayList<>(Arrays.asList("JavaScript","Java","JavaWeb",
                "SpringFramework","JavaAPI","SpringBoot","JavaEE"));

        List<String> collect = stringList.stream().
                sorted((str1,str2) -> str2.length() - str1.length()).limit(5).collect(Collectors.toList());

        System.out.println(collect);
    }


}
