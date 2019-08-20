package com.zhouyi.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Collection是所有单列集合的父接口。
 * 因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作所有的单列集合。
 * 方法如下：
 * * `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
 * * `public void clear()` :清空集合中所有的元素。
 * * `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
 * * `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
 * * `public boolean isEmpty()`: 判断当前集合是否为空。
 * * `public int size()`: 返回集合中元素的个数。
 * * `public Object[] toArray()`: 把集合中的元素，存储到数组中。
 */
public class demo01_collection_method {

    public Collection<String> list;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<String>();
    }

    @After
    public void tearDown() throws Exception {
        // `public void clear()` :清空集合中所有的元素。
        list.clear();
    }

    // `public boolean add(E e)`：  把给定的对象添加到当前集合中
    // 返回值是一个boolean值，一般都返回true，所以不用接受
    @Test
    public void addTest(){
        list.add("hello ");
        list.add("world! ");
        list.add("My name is Joey");
        System.out.println("一般都返回true ---> " + list.add("! YoYo!!"));
        list.forEach(System.out::print);
    }

    @Test
    public void sizeTest(){
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        // `public int size()`: 返回集合中元素的个数。
        System.out.printf("现在一共有:%d个参数\n", list.size());
        System.out.println(list);
        // `public Object[] toArray()`: 把集合中的元素，存储到数组中。
        String[] arr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void removeTest(){
        //`public boolean isEmpty()`: 判断当前集合是否为空。
        System.out.println("初始化后list是否为空：" + list.isEmpty());
        list.add("hello");
        // `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
        System.out.println("list中是否有hello元素：" + list.contains("hello"));
        // `public boolean remove(E e)`: 把给定的对象在当前集合中删除,返回true
        //  若集合中不存在该元素，则删除失败，返回false
        list.remove("hello");
        System.out.println("list中hello是否已经被移除：" + (!list.contains("hello")));

    }
}
