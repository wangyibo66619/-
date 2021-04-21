package oop.demo08;

/**
 * @author 王艺博
 * @date 2021/4/21 10:50
 */
public class Student extends Person{
    public void gg() {
        System.out.println("gg");
    }
}

/*
    Object object = new Student();
        // Object > Person > Student
        // Object > Person > Teacher
        // Object > String
        System.out.println(object instanceof Student);// true
        System.out.println(object instanceof Person);// true
        System.out.println(object instanceof Object);// true
        System.out.println(object instanceof Teacher);// false
        System.out.println(object instanceof String);// false
        System.out.println("############################");
        Person person = new Student();
        System.out.println(person instanceof Student);// true
        System.out.println(person instanceof Person);// true
        System.out.println(person instanceof Object);// true
        System.out.println(person instanceof Teacher);// false
        //System.out.println(person instanceof String);// 编译报错！
        System.out.println("############################");
        Student student = new Student();
        System.out.println(student instanceof Student);// true
        System.out.println(student instanceof Person);// true
        System.out.println(student instanceof Object);// true
        //System.out.println(student instanceof Teacher);// 编译报错！
        //System.out.println(student instanceof String);// 编译报错！
 */