package com.rockstar.extendsTest.demo1;

public class Employee {
    private String codeId;
    private String name;
    private String job;

    public Employee() {
    }

    public Employee(String codeId, String name, String job) {
        this.codeId = codeId;
        this.name = name;
        this.job = job;
    }

    public void work(){
        System.out.println("开始工作！");
    }

    /**
     * 获取
     * @return codeId
     */
    public String getCodeId() {
        return codeId;
    }

    /**
     * 设置
     * @param codeId
     */
    public void setCodeId(String codeId) {
        this.codeId = codeId;
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
     * @return job
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    public String toString() {
        return "Employee{codeId = " + codeId + ", name = " + name + ", job = " + job + "}";
    }
}
