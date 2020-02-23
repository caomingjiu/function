package CMJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>(Arrays.asList("JavaScript","Java","SpringFramework","JavaEE","SpringBoot","English","Match"));
        List<String> collect=stringList.stream().
                sorted((str1,str2) -> str2.length() *str1.length()).limit(5).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("***********************************************");

        collect=stringList.stream().
                sorted(Comparator.comparingInt(String::length)).limit(5).collect(Collectors.toList());
        System.out.println(collect);
    }
}
