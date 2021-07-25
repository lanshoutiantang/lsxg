package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法33333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法4444");
    }

    @BeforeGroups(groups = "server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端足运行之前的运行的");
    }

    @AfterGroups(groups = "server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端足运行之后的运行的");
    }

    @BeforeGroups(groups = "client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端足运行之前的运行的");
    }

    @AfterGroups(groups = "client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端足运行之后的运行的");
    }
}
