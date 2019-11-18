package com.classwork.chapter.wechat.wechatForm;

import javax.swing.*;
/*
* @program:Wechat
* @author:Ms.Y
* @description:
* @Date:2019-11-17 pm
* */

public class WechatForm extends JFrame {
    private JPanel PanelMain;

    public WechatForm(){
        setTitle("Wechat form");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelMain = new JPanel();
        PanelMain.setLayout(null);
    }

    public void setJframeWechatVisible(Boolean visible){setVisible(visible);}
}
