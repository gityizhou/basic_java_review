package com.zhouyi.demo01;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * try...catch
 * 异常处理的第二种方式，自己处理异常
 * 格式：
 *  try{         // 可能会产生异常的代码放在try中
 *
 *  }catch(Exception e){     需要定义一个异常的对象，用来接受try中抛出的异常对象
 *       //  产生异常对象之后的处理方式
 *       一般在工作中会把异常的信息记录到日志中
 *  }
 *  catch()可以有多个
 *  注意：
 *      1，try中可以抛出多个异常，就可以写多个catch来捕获异常处理异常
 *      2，如果try中产生了异常，就会执行catch中的处理逻辑，然后继续执行try...catch之后的代码
 *      3. 如果try中没有产生异常，那么就不会执行catch中异常的处理逻辑，自行完try中的代码，继续执行后面的代码
 */
public class Demo06_Exception_tryCatch_demo {

    public static void readFile(String path) throws FileNotFoundException, IOException {
        // FileNotFoundException是编译异常，必须处理异常
        if(!path.equals("c:\\\\a.txt")){
            throw new FileNotFoundException("传递的文件路径错误");
        }

    }

    @Test
    public void tryCatchTest(){

        try {
            readFile("aaaa");
        } catch (IOException e) {  // try中抛出什么异常对象
                            // 则catch就定义什么异常变量用来接收这个异常对象
            e.printStackTrace();
            System.out.println("catch -> 您输入的文件不存在");
        }

        System.out.println("后续代码");
    }
}
