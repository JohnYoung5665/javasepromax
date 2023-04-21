package com.rockstar.d4_constant;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {


    public static void main(String[] args) {
        // 目标：理解常量的另外一个作用：做信息的标志和分类。
        // 模拟：控制玛丽的移动：上下左右。
        // 桌面编程
        // 1、创建窗口
        JFrame win = new JFrame("超级玛丽");
        win.setSize(300, 200);

        // 2、设计一个面板（桌布）
        JPanel jPanel = new JPanel();
        win.add(jPanel);

        // 2、放置几个按钮
        JButton b1 = new JButton("上");
        jPanel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 控制玛丽往上跳
                move(Constant.UP);
            }
        });

        JButton b2 = new JButton("下");
        jPanel.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 控制玛丽往下蹲
                move(Constant.DOWN);
            }
        });

        JButton b3 = new JButton("左");
        jPanel.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 控制玛丽往左走
                move(Constant.LEFT);
            }
        });

        JButton b4 = new JButton("右");
        jPanel.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 控制玛丽往右走
                move(Constant.RIGHT);
            }
        });

        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setVisible(true);
    }

    public static void move(int orientation){
        // 控制玛丽移动
        switch (orientation) {
            case Constant.UP:
                System.out.println("玛丽往↑飞了一下~~");
                break;
            case Constant.DOWN:
                System.out.println("玛丽往↓蹲了一下~~");
                break;
            case Constant.LEFT:
                System.out.println("玛丽往←跑了一下~~");
                break;
            case Constant.RIGHT:
                System.out.println("玛丽往→跑了一下~~");
                break;
        }
    }
}
