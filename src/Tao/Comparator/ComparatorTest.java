package Tao.Comparator;

import java.util.ArrayList;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("曾传志",21));
        list.add(new Student("侯粤嘉",22));
        list.add(new Student("管江宇",24));
        list.add(new Student("曹暝桕",23));
        list.add(new Student("陶永新",20));

        //排序
        list.sort(((o1, o2) -> o2.getAge() - o1.getAge()));

        System.out.println(list);
    }
}
