package com.matrix;

/*
* 业务方法
* */
public class UserService {
    public String loginName(String loginName, String password){
        if (loginName.equals("admin") && password.equals("123456")){
            return "登录成功";
        }else {
            return "用户名或密码错误";
        }
    }

    public void selectNames(){
        System.out.println(10/2);
        System.out.println("查询全部用户名称成功~~");
    }

}
