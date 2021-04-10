package edu.hhhh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 王艺博
 * @date 2021/4/9 11:22
 */
public class demo01计算天数差 {


    public static void main(String[] args) throws ParseException {

        String date1 = "2020-11-21";
        String date2 = "2021-11-21";

        SimpleDateFormat st = new SimpleDateFormat("yyyy-MM-dd");
        // 这一行代码说明转换的格式，其中 yyyy 是完整的公元年，MM 是月份，dd是天数
        Date d1 = st.parse(date1);
        Date d2 = st.parse(date2);
        // 使用 getTime() 方法获取两个日期（自1970年1月1日经历的毫秒数值），然后比较这两个值。
        long dayBetween = (d2.getTime()-d1.getTime()) / (24*60*60*1000);
        System.out.println(dayBetween);
    }
}
