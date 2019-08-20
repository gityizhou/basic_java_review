package com.zhouyi;

import org.junit.Test;


/***
 * 由于System.out.printf()方法的用法 和 String工具类中的format()方法基本上差不多
 * 放在一起学习
 * 转换符介绍：
 * %s   -> 字符串类型
 * %c   -> 单个 字符类型
 * %b   -> 布尔类型
 * %d   -> 整数类型（十进制）  %o：整数类型（八进制）   %x:整数类型（十六进制）
 * %f   -> 浮点类型      %a: 十六进制浮点类型
 * %e   -> 指数类型  例：9.38e+5
 * %g   -> 通用浮点类型（f和e类型中较短的）
 * %h   -> 散列码
 * %%   -> 百分符号   %n:换行符号
 * %tx  -> 日期与时间类型（x代表不同的日期与时间类型转换符)
 *
 * 搭配转换符使用的标志：
 * +    为正数或者负数添加符号
 * -    左对齐
 * 0    数字前面补0
 * 空格   在整数之前添加指定数量的空格
 * ，    添加千分符
 * (    使用括号包括负数
 * #    如果是浮点数则包含小数点，如果是十六进制或者八进制则添加0x或者0
 * <    格式化前一个转换符所描述的参数
 * $    被格式化的参数索引
 */
public class demo01_printf {
    int age = 27;
    String name = "周一";
    String englishName = "Joey";
    float money = 2222.22f;
    double score = 98.77;
    double rate = 80.22;

    @Test
    public void printfTest01() {
        // 打印字符串和整数
        System.out.println("字符串和整数格式实例");
        System.out.printf("name: %s , age: %d%n", name, age);
        System.out.printf("name: %s, English name: %s%n", name, englishName);
        System.out.printf("全部转大写：%S%n", englishName);
        // 布尔类型
        System.out.println("布尔类型格式实例");
        System.out.printf("判断猫是动物吗：%b%n", 1 == 1);

        // 整数，不同进制（10,8,16）
        System.out.println("不同进制整数实例");
        System.out.printf("我的年龄十进制：%d, 八进制：%o,十六进制：%x%n", age, age, age);

    }

}
