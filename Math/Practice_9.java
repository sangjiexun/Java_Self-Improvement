package cn.sherlock.Math;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_9 {
    /*

    ## 第十题：需求实现

* 模拟用户登录。

  * 定义用户类，属性为用户名和密码。
  * 使用集合存储多个用户对象。
  * 录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。
  * 登录失败时，当用户名错误，提示没有该用户。
  * 登录失败时，当密码错误时，提示密码有误。

* 代码实现，效果如图所示：

  ![](img\10.jpg)

     */


    //static 关键字的用途 方便在没有创建对象的时候调用 方法/变量
    //写在 main()方法外面
    static ArrayList<User> users = new ArrayList<>();
    static {
        users.add(new User("张三","123"));
        users.add(new User("李四","456"));
        for (int i = 0; i < users.size(); i++) {
            users.get(i).show();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = sc.nextLine();
        System.out.println("请输入密码:");
        String pw = sc.nextLine();
        User u = new User(name,pw);
        String login = login(u);
        System.out.println("登陆结果: "+login);


        //失败的代码.......:(
//        for (int i = 0; i < users.size(); ) {
//
//            //这一步很重要!!! 首先要从static里面获取到对象
//            User user = users.get(i);
//
//            if((name.equals(user.getName())) && (pw.equals(user.getPassword()))){
//                System.out.println("用户名和密码正确");
//                return;
//            }else{
////                System.out.println("NONONONO~~~");
//            }
//        }
    }

    private static String login(User u) {
        String msg = "";
        String n = u.getName();
        String p = u.getPassword();

        
    }
}
