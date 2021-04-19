package edu.xcdq;

import java.util.Arrays;

/**
 * @author 王艺博
 * @date 2021/4/1 16:02
 */
// split()  拆分方法
public class demo05 {
    public static void main(String[] args) {
        String geci = "长亭外 古道边 芳草碧连天 晚风扶 柳笛声残 夕阳山外山";
        String[] s = geci.split(" ");
        System.out.println(Arrays.toString(s));

        for (int i = 0; i < geci.length(); i++) {
            System.out.println(s[i]);
        }
    }
}
