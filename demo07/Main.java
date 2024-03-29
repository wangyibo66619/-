package oop.demo07;

/**
 * @author 王艺博
 * @date 2021/4/19 13:25
 */
public class Main {
    public static void main(String[] args) {
        // 一个对象的实际类型是确定的
        // new Person();
        // new Student();

        // 可以指向的引用类型就不确定了:父类的引用指向子类

        // Student能调用的方法都是自己或继承父类的
        Student s1 = new Student();
        // Person 父类型，可以指向子类，但是不能调用子类独有的方法
        Person s2 = new Student();
        Object s3 = new Student();

        // 对象能执行那些方法，主要看对象左边的类型，和右边关系不大
        // s2.eat();// 子类重写了父类的方法，执行子类的方法
        s1.eat();



    }
}
