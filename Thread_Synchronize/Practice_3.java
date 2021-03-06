package cn.sherlock.Thread_Synchronize;

public class Practice_3 {
    /*
    多线程练习
    Q:
    请编写程序，分别打印主线程的名称和子线程的名称。
	要求使用两种方式实现：
		第一种方式：继承Thread类。
		第二种方法：实现Runnable接口。

    A:
    操作步骤描述
    	第一种方式：继承Thread类
		1.定义一个子线程的类，继承Thread类；
 	 	2.在子线程类中重写run方法，在run方法中打印子线程的名称；
  		3.定义一个测试类；
  		4.在main方法中打印主线程的名称；
     	5.在main方法中创建子线程对象；
     	6.调用子线程对象的start方法，开启子线程；

    	第二种方式：实现Runnable接口
    1.定义一个子任务类，实现Runnable接口；
    2.在子任务类中重写run方法，在run方法中打印子线程的名称；
    3.定义一个测试类；
    4.在main方法中打印主线程的名称；
    5.在main方法中创建一个子任务对象；
    6.在main方法中创建一个Thread类的对象，并把子任务对象传递给Thread类的构造方法；
    7.调用Thread类对象的start方法开启子线程
     */

















}
