package com.llz.core.anno;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Singer singer = new Singer("筷子兄弟");
        Song song = new Song("《小苹果》");

        singer.sing(song);

        Method method = singer.getClass().getDeclaredMethod("sing", song.getClass());
        method.invoke(singer, song);

        Music music = method.getAnnotation(Music.class);
        if (music != null && music.change() != null) {
            song.setName(music.change());
        }
        method.invoke(singer, song);
    }
}
