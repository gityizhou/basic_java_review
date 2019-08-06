package com.zhouyi.demo01;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo07_Exception_Throwable_demo {

    public static void readFile(String path) throws FileNotFoundException, IOException {
        // FileNotFoundException是编译异常，必须处理异常
        if(!path.equals("c:\\\\a.txt")){
            throw new FileNotFoundException("传递的文件路径错误");
        }

    }

    @Test
    public void throwableTest(){

        try {
            readFile("aaaa");
        } catch (IOException e) {
            /**
             * Throwable类中定义了3个异常处理的方法：
             * 打印e默认调用的是toString方法
             * String getMessage()  返回此 Throwable 的简短描述
             * String toString()    返回此 Throwable 的详细信息字符串
             * void printStackTrace()   JVM打印异常对象，默认使用此方法，异常信息是最全面的
             */
            // System.out.println(e.getMessage());
            // System.out.println(e.toString());
            // System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("后续代码");
    }
}
