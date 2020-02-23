package Tao.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Tao
 */
public class MaxLengthSteamTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("JavaScript","Java","JavaWeb",
                "SpringFramework","JavaAPI","SpringBoot","JavaEE"));

        //重写接口，实现把最长的字符串集中到一个结果中
        MaxLengthSteam mls = list -> {
            List<String> result = new ArrayList<>(5);
            for (int i = 0;i < 5;i++){
                //找出长度最长的字符串
                String s = stringList.stream().max(Comparator.comparingInt(String::length)).get();
                //加入结果集
                result.add(s);
                //从集合中移除
                stringList.removeIf(str ->str.equals(s));
            }
            return result;
        };
        //调用目标方法
        List<String> maxLengthWords = mls.getMaxLengthWords(stringList);
        //输出结果
        System.out.println(maxLengthWords);
    }
}
