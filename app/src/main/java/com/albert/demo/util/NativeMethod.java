package com.albert.demo.util;

public class NativeMethod{
    //静态代码块 引入资源
    static {
        System.loadLibrary("native-lib");
    }
    //获取jni层的一个字符串显示
    public static native String helloFormC();
}