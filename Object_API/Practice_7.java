package cn.sherlock.Object_API;

import java.util.Calendar;

public class Practice_7 {
    /*
    Calendar类方法的使用
    Q:用程序判断2018年2月14日是星期几
     */
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //用getInstance方法创建一个Calendar对象
        c.set(Calendar.YEAR,2018);
        c.set(Calendar.MONTH,2);
        c.set(Calendar.DATE,14);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);

        char week = getWeek(c.get(Calendar.DAY_OF_WEEK));

        System.out.println(year+"年"+month+"”+date+week);
    }
    public static char getWeek(int a){
        char[] c = {' ','日','一','二','三','四','五','六'};
        return c[a];
    }
}
