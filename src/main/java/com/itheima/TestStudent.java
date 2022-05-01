package com.itheima;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取StudentDao实例
        StudentDao studentDao =
                (StudentDao) applicationContext.getBean("studentDao");
        System.out.println("欢迎来到学生管理系统~");
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        System.out.println("请输入" + username +"的密码：");
        Scanner sc1 = new Scanner(System.in);
        int  password= sc1.nextInt();
        System.out.println(password);
        //equals比较的是字符串的内容是否相同，而==比较的是对象在内存的地址是否相同
        if (username.equals("马原") && password == 5211314){
            System.out.println("登录成功！" + username +"先生您好！");
            //执行findStudentByName方法
            //Student student = studentDao.findAccountByName(username);
            //System.out.println(student);
        }else {
            System.out.println("用户登录失败~~~");
        }
    }

}
