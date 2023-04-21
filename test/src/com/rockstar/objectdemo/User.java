package com.rockstar.objectdemo;

import java.util.Arrays;
import java.util.Objects;

public class User implements Cloneable {
    private int id;
    private String userName;
    private String password;
    private String image;
    private int[] data;

    public User() {
    }

    public User(int id, String userName, String password, String image, int[] data) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.image = image;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", image='" + image + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(userName, user.userName) && Objects.equals(password, user.password) && Objects.equals(image, user.image) && Arrays.equals(data, user.data);
    }

    @Override
    public int hashCode() {
        return 0;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法
        //相当于让Java帮我们克隆了一个对象，并把克隆之后的对象返回出去。

        //深克隆改写
        //先把克隆对象中的数组获取出来
        int[] data = this.data;
        //创建新的数组
        int[] newData = new int[data.length];
        //拷贝原数组的数据到新数组
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        //调用父类中的方法克隆对象
        User u = (User) super.clone();
        //因为父类中的克隆方法是浅克隆，所以替换克隆出来对象中的数组地址值
        //把新数组赋值给新对象
        u.data = newData;
        return u;
    }
}
