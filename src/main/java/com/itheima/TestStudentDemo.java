package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestStudentDemo {
    @Test
    public void TestaddStudent() {
        //加载配置文件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取StudentDao实例
        StudentDao studentDao =
                (StudentDao) applicationContext.getBean("studentDao");
        //创建Student对象，并向Student对象中添加数据
        Student student = new Student();
        student.setSname("小黄帽");
        student.setAge(16);
        student.setClassname("园艺202");
        //执行addStudent方法,并返回结果
        int num = studentDao.addStudent(student);
        if (num > 0) {
            System.out.println("****成功添加了" + num + "条数据****");
        } else {
            System.out.println("****添加数据失败****");
        }
    }

    @Test
    public void TestdeleteStudent() {
        //加载配置文件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取StudentDao实例
        StudentDao studentDao =
                (StudentDao) applicationContext.getBean("studentDao");
        //执行deleteStudent方法，并返回结果
        int num = studentDao.deleteStudent(2);
        if (num > 0) {
            System.out.println("****成功删除了" + num + "条数据****");
        } else {
            System.out.println("****删除数据失败****");
        }
    }
    @Test
    public void TestupdateStudent() {
        //加载配置文件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取StudentDao实例
        StudentDao studentDao =
                (StudentDao) applicationContext.getBean("studentDao");
        //创建Student对象，并向Student对象中添加数据
        Student student = new Student();
        student.setId(1);
        student.setSname("牛三智");
        student.setAge(19);
        student.setClassname("数控201");
        //执行updateStudent方法，并返回结果
        int num = studentDao.updateStudent(student);
        if (num > 0) {
            System.out.println("****成功更新了" + num + "条数据****");
        } else {
            System.out.println("****更新数据失败****");
        }
    }
    @Test
    public void TestfindStudentById() {
        //加载配置文件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取StudentDao实例
        StudentDao studentDao =
                (StudentDao) applicationContext.getBean("studentDao");
        //执行findStudentById方法，并返回结果
        Student student= studentDao.findStudentById(1);
        System.out.println(student);
    }
    @Test
    public void TestAfindAllStudent() {
        //加载配置文件
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取StudentDao实例
        StudentDao studentDao =
                (StudentDao) applicationContext.getBean("studentDao");
        //执行findStudentById方法，并返回结果
        List<Student> student= studentDao.findAllStudent();
        //遍历结果
        for (Student st:student){
             System.out.println(st);
        }
    }
}