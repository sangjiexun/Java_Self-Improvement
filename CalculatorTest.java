package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {


    @Before
    public void init(){
        System.out.println("init...");
    }


    @After
    public void close(){
        System.out.println("close....");
    }



    @Test
    public void testAdd(){
//        System.out.println("我被执行了");
        Calculator c= new Calculator();
        int result = c.add(1, 2);
        System.out.println(result);


    }
}
