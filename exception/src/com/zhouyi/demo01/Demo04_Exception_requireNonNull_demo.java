package com.zhouyi.demo01;

import org.junit.Test;

import java.util.Objects;

/**
 *  Objects工具类中的requireNonNull方法： 查看引用对象是否为null
 *  public static <T> T requireNonNull(T obj) {
 *         if (obj == null)
 *             throw new NullPointerException();
 *         return obj;
 *     }
 */
public class Demo04_Exception_requireNonNull_demo {

    public static void requireNonNull(Object object){
        if(object == null){
            throw new NullPointerException("传递的对象为null");
        }
    }

    // 自己写的
    @Test
    public void requireNonNullTest(){
        requireNonNull(null);
    }

    @Test
    public void objectsRequireNonNullTest(){
        // 此为Objects类中方法，可以用来检测对象是否为空
        Objects.requireNonNull(null, "传递的对象为空");
    }

}
