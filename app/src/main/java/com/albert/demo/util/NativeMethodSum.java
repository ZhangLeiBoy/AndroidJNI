package com.albert.demo.util;

public class NativeMethodSum {
    //静态代码块 引入资源
    static {
        System.loadLibrary("demo-lib");
    }

    //两个数字求和
    public static native int sum(int a,int b);

    //c++中的twoSum函数需要传递一个数组，而java的数组是不能直接作为参数传递给c++函数的，因此需要Jni作一层转换
    //传入一个int 数组，一个目标值
    //取该数组内哪两个值的和是和目标值相等的
    //输出这两个值的位置脚标
    public static native int[] twoSum(int[] nums,int target);
}