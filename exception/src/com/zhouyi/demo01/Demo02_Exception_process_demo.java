package com.zhouyi.demo01;

import org.junit.Test;

/**
 * 异常的产生过程解析（分析异常如何产生，如何处理）
 */
public class Demo02_Exception_process_demo {

    public static int getElement(int[] arr, int index){
        int ele = arr[index];
        return ele;
    }

    @Test
    public void processTest(){
        int[] arr = {1, 2, 3};
        /**
         * 发生异常后JVM会做两件事：
         * （1） JVM会根据异常产生原因创建异常对象，这个异常对象包含了异常产生的内容，原因和位置
         *      new java.lang.ArrayIndexOutOfBoundsException(3);
         * （2) 因为在getElement没有异常处理逻辑（try...catch...)
         *      JVM就会把异常抛给方法的调用者processTest方法处理异常
         *      processTest方法接收到这个异常对象，main方法也没有异常的处理逻辑
         *      又抛回给JVM，JVM接收到异常后  把异常对象（内容，原因，位置）以红色字体打印在控制台
         *      然后终止当前正在执行的java程序   -- > 中断处理
         */
        // 访问了arr的3索引，而arr没有3索引，则JVM会检测出程序出现异常
        int e = getElement(arr, 3);
        System.out.println(e);
    }
}
