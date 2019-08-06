package com.zhouyi.demo01;

import org.junit.Test;

/**
 * throw关键字
 * 作用：
 * 可以使用指定方法中抛出指定的异常
 * 使用格式：
 * throw new XXXException("异常产生的原因");
 * 注意事项：
 * 1. 必须写在方法的内部
 * 2. new的对象必须是Exception或者Exception的子类对象
 * 3. 抛出指定的异常对象，我们必须处理这个对象
 * throw后面创建的是RunTimeException 或者 RunTimeException的子类，我们可以不处理，由JVM处理
 * throw后面创建的是compile Exception，我们就必须处理这个异常，要么throws，要么try...catch...
 */
public class Demo03_Exception_throw_demo {

    /*
    工作中我们必须对方法传递过来的参数进行合法性校验
    如果参数不合法，那么我们必须使用抛出异常的方式，告知调用者传递的参数有问题
     */
    public static int getElement(int[] arr, int index) {
        // 对传递过来的参数进行合法性校验
//        如果数组arr的值是null，我们就抛出空指针异常，传递的数组的值是空的
        if (arr == null) {
            throw new NullPointerException("传递的数组为空");
        }
        if (index >= arr.length | index <0) {
            throw new ArrayIndexOutOfBoundsException("超出数组索引范围");
        }
        int ele = arr[index];
        return ele;
    }

    @Test
    public void throwNullPointerExceptionTest() {
        getElement(new int[5], 7);
        // runtime异常默认交给JVM处理，程序停止运行
        System.out.println("抛出异常后");
    }



}
