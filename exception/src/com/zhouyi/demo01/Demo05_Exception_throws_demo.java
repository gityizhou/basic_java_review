package com.zhouyi.demo01;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * throws关键字：
 *      是异常处理的第一种方式，甩锅，交给别人处理
 *      作用：
 *          当方法内部抛出异常对象的时候，那么我们就必须处理这个异常对象
 *          可以使用throws关键字处理异常对象，会把异常对象声明抛给方法的调用者处理
 *          最终交给JVM处理   ---> 中断处理
 *      在方法声明时使用，一般搭配throw new使用
 *      注意：（1）throws必须写在方法声明处
 *           （2）throws后面声明的异常对象必须是Exception或者其子类
 *           （3）方法内部如果throw了多个异常对象，throws后面也必须声明多个异常
 *                  如果抛出的异常有子父类关系，那么直接只声明父类也可以
 *           （4）调用了一个声明抛出的方法，就必须处理声明的异常：
 *                  要么就继续使用throws抛出，交给下一个调用者处理，最终交给JVM进行中断处理
 *                  要么try...catch自己处理掉异常
 *      缺陷：throws抛出异常的话，最终由JVM终止程序，而不会再运行后面的代码。
 */
public class Demo05_Exception_throws_demo {

    // FileNotFoundException 是 IOException 的子类，只需要声明IOException即可
    @Test
    public void throwsTest() throws FileNotFoundException, IOException{
        readFile("aaa");
    }

    // 对路径合法性进行判断
    public static void readFile(String path) throws FileNotFoundException, IOException{
        if(!path.equals("c:\\\\a.txt")){
            // FileNotFoundException是编译异常，必须处理异常
            throw new FileNotFoundException("传递的文件路径错误");
        }

        if(!path.endsWith(".txt")){
            throw new IOException("错误的文件格式,需要传入txt格式");
        }
    }

}
