package oop.demo02;

/**
 * @author 王艺博
 * @date 2021/4/1 19:57
 */
// 一个项目应该只存一个main方法
public class Application {
    // new 实例化一个对象
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);// null
    }
}
