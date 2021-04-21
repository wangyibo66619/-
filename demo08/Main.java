package oop.demo08;

/**
 * @author 王艺博
 * @date 2021/4/21 10:50
 */
public class Main {
    public static void main(String[] args) {
        // 类型之间的转换：父  子
        // 高                  低
        Person person = new Student();
        person.run();
        // person.gg();编译报错
        // person将这个对象转换为Student类型，就可以使用Student类型的方法了
        // 强制转换
        ((Student)person).gg();

        System.out.println("###################");
        // 子类转换父类，可能会丢失自己本身的一些方法！
        Student student = new Student();
        student.gg();
        Person person1 = student;
        ((Student)person1).gg();
    }
}
/*
    1.父类的引用指向子类的对象
    2.把子类转换为父类，向上转型
    3.把父类转换为子类，向下转型：强制转换
    4.方便方法的调用，减少重复的代码
 */
