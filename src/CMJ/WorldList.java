package CMJ;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WorldList {
    public static void main(String[] args) {
        List<Wrold> list = new ArrayList<Wrold>();
        list.add(new Wrold(1, "abcd"));
        list.add(new Wrold(2, "bbc"));
        list.add(new Wrold(3, "abcdef"));

        System.out.println("---Sorting using Comparator by Age---");
        List<Wrold> wroldList = list.stream().sorted(Comparator.comparing(Wrold::getName)).collect(Collectors.toList());
        wroldList.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()));

        System.out.println("---Sorting using Comparator by Age---");
        wroldList = list.stream().sorted(Comparator.comparing(Wrold::getName).reversed()).collect(Collectors.toList());
        wroldList.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()));

    }
}
