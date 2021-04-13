package oop.demo02;

/**
 * @author 王艺博
 * @date 2021/4/1 20:45
 */
public class Person {
    // 一个类什么都不写，它也会存在一个方法
    // 显示的定义构造器
    String name;
    // 实例化初始值
    // 使用new关键字，本质是在调用构造器
    public Person() {}

    // 有参构造
    public Person(String name) {
        this.name = name;
    }

    // all+Insert

}

/*
// new 实例化一个对象
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);// null
    }
    构造器：
        1. 和类名相同
        2. 没有返回值
    作用：
        1. new 本质在调用方法
        2. 初始化对象的值
    注意点：
        1. 定义有参构造制后，如果想使用无参构造，显示的定义一个无参的构造

 */