package core.collection;

import java.util.HashMap;
import java.util.Map;

public class HashDemo {
    public static void main(String[] args) {
        String a = "Aa";
        String b = "BB";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Map<String, String> map = new HashMap<>();
        map.put(a, a);
        map.put(b, a);
        map.put(a, b);

        System.out.println(map);
    }

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HashDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
