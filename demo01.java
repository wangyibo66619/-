package edu.xcdq;

import java.util.Scanner;

/**
 * @author 王艺博
 * @date 2021/4/1 14:47
 */

// equals() 用于判断字符串的值是否相等
public class demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        if ( "tom".equals(name) && "1234567".equals(password) ) {
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
        // equalsIgnoreCase()  忽略大小写判断是否相等
        if ( "tom".equalsIgnoreCase(name) && "1234567".equalsIgnoreCase(password) ) {
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }

        // toUpperCase  转为大写
        System.out.println("tom".toUpperCase());
        // toLowerCase  转为小写
        System.out.println("TOM".toLowerCase());
        /*
        equals()实现的思路
            1 先判断是否是同一个对象，如果是，则相等
            2 判断要传入的对象是否是字符串类型
                2.1 判断长度是否相等，如果不等，直接返回不相等
                2.1 如果长度相等，循环判断每一位是否相等，如果\不等，就直接退出
                    每一位都相等，则返回true
            3 如果不是，直接返回不相等
         */
    }
}
