package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/4/1 15:50
 */
// substring()  截取
// trim() 去掉字符串开头和结尾的空格
public class demo04 {
    public static void main(String[] args) {
        String s = "今天是阴天并且是愚人节";
        System.out.println(s.substring(3)); // 从3开始截取，一直到最后
        System.out.println(s.substring(3,6)); // 从3开始截取，一直到最后[3,6),包含3位置的元素，不包含6的位置的元素


        String test01 = "    哈哈哈呵呵呵嘿嘿嘿哈哈哈    ";
        System.out.println(test01);
        System.out.println(test01.trim());
    }
}
