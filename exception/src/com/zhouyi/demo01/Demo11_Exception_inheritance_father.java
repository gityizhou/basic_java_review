package com.zhouyi.demo01;

/**
 * 如果父类抛出了多个异常
 * 子类重写父类方法时，抛出和父类相同的异常或者是父类异常的子类或者不抛出异常
 * 父类方法若没有抛出异常，则子类重写父类该方法是不可抛出异常。
 * 此时子类产生该异常，只能捕获处理，不能声明抛出
 */
public class Demo11_Exception_inheritance_father {
    public void show01() throws NullPointerException, ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04(){}
}

class Demo11_Exception_inheritance_son extends Demo11_Exception_inheritance_father{
    // 子类重写父类方法时，抛出和父类相同异常
    public void show01() throws NullPointerException, ClassCastException {}
    // 子类重写父类方法时，抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException {}
    // 子类重写父类方法时，也可以不抛出父类的异常
    public void show03(){}
    // 父类方法若没有抛出异常，则子类重写父类该方法是不可抛出异常。
    // 此时子类产生该异常，只能捕获处理，不能声明抛出
    public void show04(){
        try {
            throw new Exception("compile exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
