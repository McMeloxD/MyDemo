package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestAccount {
    @Test
    public void TestAddAccount(){
        //加载配置文件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        //创建Account对象，并向Account对象中添加数据
        Account account = new Account();
        account.setUsername("dd");
        account.setBalance(2520.30);
        //执行addAccount（）方法,并获取返回结果
        int num = accountDao.addAccount(account);
        if (num>0){
            System.out.println("***成功插入了"+ num + "条数据***");
        }else {
            System.out.println("***插入失败***");
        }
    }
    @Test
    public void TestUpdateAccount(){
        //加载配置文件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        //创建Account对象，并向Account对象中添加数据
        Account account = new Account();
        account.setId(1);
        account.setUsername("James");
        account.setBalance(2000.00);
        //执行updateAccount（）方法,并获取返回结果
        int num = accountDao.updateAccount(account);
        if (num>0){
            System.out.println("***成功更新了"+ num +"条数据***");
        }else {
            System.out.println("***更新数据失败***");
        }
    }
    @Test
    public void TestDeleteAccount(){
        //加载配置文件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        //执行deleteAccount（）方法，并获取返回结果
        int num = accountDao.deleteAccount(4);
        if (num >0){
            System.out.println("***成功删除"+ num +"条数据***");
        }else {
            System.out.println("***删除数据失败***");
        }
    }
    @Test
    public void TestFindAccountById(){
        //加载配置文件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        //执行findAccountById（）方法
        Account account = accountDao.findAccountById(2);
        System.out.println(account);
    }
    @Test
    public void TestFindAllAccount(){
        //加载配置文件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        //执行findAllAccount（）方法
        List<Account> account= accountDao.findAllAccount();
        //遍历结果
        for (Account act : account){
            System.out.println(act);
        }
    }
    //基于注解事务配置
    @Test
    public void TestTransaction(){
        //加载配置文件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext-annotation.xml");
        //获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        //调用实例中转账方法
        accountDao.transfer("dd","Tom",521.00);
        //输出提示信息
        System.out.println("***转账成功***");
    }
    //基于xml事务配置
    @Test
    public void TestTransaction1(){
        //加载配置文件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        //调用实例中转账方法
        accountDao.transfer1("mayuan","hushi",52.10);
        //输出提示信息
        System.out.println("***转账成功***");
    }
}
