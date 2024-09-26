package com.msb.controller;


import com.msb.pojo.User;
import com.msb.service.Service;
import com.msb.service_impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Mycontroller {
    @Autowired
    Service s;
//    int a=10;sds

    public void test(int id){
        User user = s.select(id);
        System.out.println(user==null ?"未找到":user);
        System.out.println("测试");
        System.out.println("dev分支添加的语句");// 19:26
        System.out.println("主干添加的语句");// 19:29
    }
    public static void main(String[] args) {
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        Mycontroller bean = (Mycontroller) ac.getBean("mycontroller");
        bean.test(1);
    }
}
