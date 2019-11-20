package com.classwork.chapter.wechat.weformRegis;

import com.classwork.chapter.wechat.loginForm.LoginForm;
import com.classwork.chapter.wechat.wechatForm.WechatForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program:
 * @Author:Mr.Y
 * @Description:
 * @Data:2019/11/18
 */
public class WeformRegis extends JFrame {
    private JPanel registerJPanel;
    private JLabel registerJLabel;
    private JButton backButton;

    public WeformRegis(){
        setTitle("WeChatRegister Form");
        setSize(300,190);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        registerJPanel = new JPanel();
        registerJPanel.setLayout(null);

        registerJLabel = new JLabel("Register success!");
        registerJLabel.setBounds(50,30,150,60);
        registerJPanel.add(registerJLabel);

        backButton = new JButton("Back");
        backButton.setBounds(50,100,80,25);
        registerJPanel.add(backButton);

        add(registerJPanel);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                LoginForm loginForm = new LoginForm();
                loginForm.setLoginJFarmeVisible(true);
            }
        });

    }
    public void setWeformRegisVisible(Boolean visible){setVisible(visible);}
}
