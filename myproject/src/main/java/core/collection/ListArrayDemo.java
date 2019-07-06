package core.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        System.out.println(list);

        String[] strs = new String[list.size()];
        list.toArray(strs);
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + ",");
        }

        String[] str2 = new String[]{"jack", "tom"};
        List<String> list2 = Arrays.asList(str2);
        System.out.println(list2);
    }
}
