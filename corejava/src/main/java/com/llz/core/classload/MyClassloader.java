package com.llz.core.classload;

import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandlerFactory;

public class MyClassloader extends URLClassLoader {
    public MyClassloader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    public MyClassloader(URL[] urls) {
        super(urls);
    }

    public MyClassloader(URL[] urls, ClassLoader parent, URLStreamHandlerFactory factory) {
        super(urls, parent, factory);
    }
}
