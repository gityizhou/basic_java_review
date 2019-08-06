package com.zhouyi.demo01;

import com.zhouyi.demo01.Demo12_Exception_customException_demo.RegisterException;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * 多个异常的处理方法
 * 1.多个异常分别处理
 * 2.多个异常一次捕获，多次处理
 * 3.多个异常一次捕获，一次处理
 * 运行时异常异常可以被抛出不处理。即不捕获也不声明抛出，默认给JVM处理，直接终止程序
 */
public class Demo10_Exception_multiple_demo {

    public List<Integer> list = List.of(1, 2, 3);
    public int[] arr = {1, 2, 3};

//    1.多个异常分别处理
    @Test
    public void multipleProcessTest01(){

        try {
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        try {
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("后续代码...");

    }

    // 2.多个异常一次捕获，多次处理
    // catch里面定义的异常对象，如果有父子类关系，那么子类的异常变量必须写在上面，否则报错
    // 原因：try中如果出现了异常对象，会把异常对象抛出给catch处理，抛出的异常对象，会从上到下一次赋值给catch中定义的异常变量
    // 父类要是写在上面，就会直接被截取
    @Test
    public void multipleProcessTest02(){

        try{
            System.out.println(arr[3]);  // 假设第一个异常，try后面的代码不会再运行
            System.out.println(list.get(3));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("后续代码...");

    }

    // 3.多个异常一次捕获，一次处理
    @Test
    public void multipleProcessTest03(){

        try{
            System.out.println(arr[3]);  // 假设第一个异常，try后面的代码不会再运行
            System.out.println(list.get(3));
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("后续代码...");

    }


}
