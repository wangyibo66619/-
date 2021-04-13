package oop.demo03;

/**
 * @author 王艺博
 * @date 2021/4/13 9:07
 */
// 类    private: 私有
public class Encapsulation {

    // 属性私有
    private String name;    // 名字
    private int id;    // 学号
    private char sex;    // 性别
    private int age; // 年龄

    // 提供一些可以操作这些属性的方法
    // 提供一些public的get、set方法

    // get 获得这个数据
    public String getName() {
        return name;
    }
    // set 给这个数据设定值
    public void setName(String name) {
        this.name = name;
    }
    // alt + Insert  快捷键 自动生成下面这些获取属性方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {// 不合法
        if ( age > 120 || age < 0 ) {
            this.age = 3;
        }else {
            this.age = age;
        }
    }
}
/*

   // 1 提高程序的安全性，保护数据
   // 2 隐藏代码的实现细节
   // 3 统一接口
   // 4 系统可维护性增加了

public class main {
    public static void main(String[] args) {
        Student st = new Student();
        st.setAge(150);
        System.out.println(st.getAge());

    }
}
 */
