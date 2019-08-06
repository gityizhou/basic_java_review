package com.zhouyi.demo01;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * try{
 *
 * }catch(){
 *
 * }finally{
 *     // 无论是否出现异常，都会执行
 * }      // 不能单独使用，必须和try..。catch...一起执行
 * 执行try...catch...代码时，如果try中把异常抛出
 * 则try中这句异常代码后续的代码不会再被运行
 * 如果把代码放在，finally代码块中，则不论如何最终都会执行这部分代码
 * 一般用于资源释放（资源回收），无论程序是否出现异常，最后都要资源释放（IO）
 *   **如果finally中有return语句，将永远返回finally中的结果，应该避免该情况
 */
public class Demo09_Exception_finally_demo {
    public static void readFile(String path) throws FileNotFoundException, IOException {
        if(!path.equals("c:\\\\a.txt")){
            throw new FileNotFoundException("传递的文件路径错误");
        }
        System.out.println("资源没有问题，开始处理文件");

    }

    @Test
    public void finallyTest(){

        try {
            // 可能会产生异常的代码
            readFile("c:\\\\a.txt");
        } catch (IOException e) {
            // 异常的处理逻辑
            e.printStackTrace();
        } finally {
            // 无论是否出现异常都会执行
            System.out.println("资源释放");
        }

        System.out.println("后续代码");
    }

    // 定义一个方法，返回变量a
    // 如果finally中有return语句，则不管try中有无return，都返回finally中return结果
    public static int getA(){
        int a = 10;
        try{
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            // 一定会执行的代码
            a = 100;
            return a;
        }
    }

    @Test
    public void finallyReturnTest(){
        System.out.println(getA());
    }

}
