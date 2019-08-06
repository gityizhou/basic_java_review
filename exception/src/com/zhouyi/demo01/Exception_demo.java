package com.zhouyi.demo01;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * java.lang.Throwable: 类是 Java中所有错误或者异常的超类
 * Exception: 编译期异常， 进行编译时，java程序出现问题
 * RunTimeExcption: 运行期异常，java程序运行时，出现的异常
 */
public class Exception_demo{

    @Test
    public void throwCompileExceptionTest() throws ParseException {
        // Exception_demo: 编译期异常， 进行编译时，java程序出现问题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 抛出异常后由JVM来处理异常，处理方式就是直接终止程序，并抛出异常
        Date date = sdf.parse("199912-01");
        System.out.println(date);
    }

    @Test
    public void tryCatchCompileExceptionTest(){
        // Exception: 编译期异常， 进行编译时，java程序出现问题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 使用try/catch来处理异常，异常处理后可以正常往下执行
        Date date = null;
        try {
            date = sdf.parse("199912-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("后续代码");
    }

    @Test
    public void runTimeExceptionTest() {
        // RunTimeExcption: 运行期异常，java程序运行时，出现的异常
        int[] arr = {1, 2, 3};
        // System.out.println(arr[0]);
        try {
            // try中放可能会存在异常的代码
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("后续代码...");
        System.out.println("arr: " + Arrays.toString(arr));

    }
}
