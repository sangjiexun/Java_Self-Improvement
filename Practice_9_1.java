package cn.itcast.test;

public class Practice_9_1 {

    public static void main(String[] args) {
        invokeCalc(30,20,( a, b ) -> a-b );
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int res = calculator.calc(a,b);//这条语句就把int a，int b传进了 Calculate的参数列表里面了
        System.out.println("结果:"+res);

    }
}
