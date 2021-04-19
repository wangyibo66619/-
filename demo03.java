package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/4/1 15:39
 */
// indexOf() 返回第一次出现的位置的索引
// lastIndexOf() 返回从后往前第一次出现的元素 所在的索引（索引： 永远都是 从0开始 从前往后数）
public class demo03 {
    public static void main(String[] args) {
        String s = "春青草春无悔";
        System.out.println(s.indexOf("春"));
        System.out.println(s.lastIndexOf("春"));
    }
}
