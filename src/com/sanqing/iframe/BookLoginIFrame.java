package com.sanqing.iframe;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BookLoginIFrame extends JFrame {
    public BookLoginIFrame(){
        super();
        final BorderLayout borderLayout=new BorderLayout();//创建布局管理器
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭按钮处理事件
        borderLayout.setVgap(10);//设置组件之间的垂直距离
        getContentPane().setLayout(borderLayout);//使用布局管理器
        setTitle("图书馆管理系统登录");
        Toolkit tool=Toolkit.getDefaultToolkit();//使用默认的工具箱
        Dimension screenSize=tool.getScreenSize();//获得屏幕的大小
        setSize(285,149);//设置窗体大小
        setLocation(screenSize.width-getWidth()/2,screenSize.height-getHeight()/2);//设置窗体位置
        final JPanel mainPanel=new JPanel();//创建主面板
        mainPanel.setLayout(new BorderLayout());//设置边框布局
        mainPanel.setBorder(new EmptyBorder(0,0,0,0));
        getContentPane().add(mainPanel);
        final JLabel imageLabel=new JLabel();//创建一个标签来显示图片

    }
}
