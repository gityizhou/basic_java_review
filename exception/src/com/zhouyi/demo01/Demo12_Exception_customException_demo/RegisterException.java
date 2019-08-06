package com.zhouyi.demo01.Demo12_Exception_customException_demo;

/**
 * 自定义异常类
 *      java给我们提供的异常类，不够我们使用，需要自己定义一些异常类
 *  格式：
 *      public class XXXException extends Exception / RuntimeException{
 *          添加一个空参构造方法
 *          添加一个带异常信息的构造方法
 *      }
 *  注意：
 *      1.自定义异常类一般都是以Exception结尾，说明该类是一个异常类
 *      2.自定义异常类，必须继承Exception 或者 RuntimeException
 *          继承Exception：那么自定义的异常类是就是一个编译期异常。
 *                          如果方法内部抛出了编译异常，就必须处理这哥异常要么throws，要么try...catch...
 *          继承RuntimeException：运行期异常可以无需处理，直接交给JVM处理（中断处理）
 */
public class RegisterException extends Exception{

    // 添加一个空参构造方法
    public RegisterException() {
    }

    // 添加一个带异常信息的构造方法
    // 查看源码发现，所有的异常类都会有一个带异常信息的构造方法，方法内部会调用父类异常信息的构造方法，让父类来处理这个异常信息
    public RegisterException(String message) {
        super(message);
    }
}
