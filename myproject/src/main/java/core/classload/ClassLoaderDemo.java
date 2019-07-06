package core.classload;

import core.collection.HashDemo;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            Class<HashDemo> clazz = (Class<HashDemo>) classLoader.loadClass("core.collection.HashDemo");
//            Class<HashDemo> clazz = HashDemo.class;
            System.out.println(clazz);
            HashDemo hd = clazz.newInstance();
            hd.setName("jack");
            hd.setAge(10);
            System.out.println(hd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
