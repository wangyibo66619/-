package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/4/1 15:11
 */
// concat() 拼接操作
public class demo02 {
    public static void main(String[] args) {
        int java = 99;
        int mysql = 89;
        int html = 95;
        System.out.println("java:" + java + "mysql:" + mysql + "html:" + html);

        String name = "小王";
        String play = "玩耍";
        System.out.println(name.concat(play));
    }
}
