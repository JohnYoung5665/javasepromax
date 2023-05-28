package com.matrix;

public class Contact {
    private String name;
    private int id;
    private boolean vip;
    private char gender;
    private String email;


    public Contact() {
    }

    public Contact(String name, int id, boolean vip, char gender, String email) {
        this.name = name;
        this.id = id;
        this.vip = vip;
        this.gender = gender;
        this.email = email;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return vip
     */
    public boolean isVip() {
        return vip;
    }

    /**
     * 设置
     * @param vip
     */
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    /**
     * 获取
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Contact{name = " + name + ", id = " + id + ", vip = " + vip + ", gender = " + gender + ", email = " + email + "}";
    }
}
