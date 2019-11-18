package com.classwork.chapter.wechat.loginForm;

/**
 * @program:
 * @Author:Mr.Y
 * @Description:
 * @Data:2019/11/17
 */

import com.classwork.chapter.wechat.register.Register;
import com.classwork.chapter.wechat.wechatForm.WechatForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {

    private JPanel LoginJPanel;
    private JLabel loginJLabel;
    private JTextField loginText;
    private JLabel passwordJLabel;
    private JTextField passwordJText;
    private JButton loginJButton;
    private JButton registerJButton;

    public LoginForm(){
        setTitle("Login Form");
        setSize(300,190);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LoginJPanel = new JPanel();
        LoginJPanel.setLayout(null);

        loginJLabel = new JLabel("Login:");
        loginJLabel.setBounds(10,10,80,25);
        LoginJPanel.add(loginJLabel);

        loginText = new JTextField(10);
        loginText.setBounds(100,10,165,25);
        LoginJPanel.add(loginText);

        passwordJLabel = new JLabel("PassWord:");
        passwordJLabel.setBounds(10,50,80,25);
        LoginJPanel.add(passwordJLabel);

        passwordJText = new JTextField(10);
        passwordJText.setBounds(100,50,165,25);
        LoginJPanel.add(passwordJText);

        loginJButton = new JButton("Login");
        loginJButton.setBounds(10,90,80,25);
        LoginJPanel.add(loginJButton);

        registerJButton = new JButton("Register");
        registerJButton.setBounds(100,90,80,25);
        LoginJPanel.add(registerJButton);

        add(LoginJPanel);

        loginJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                WechatForm wechatForm = new WechatForm();
                wechatForm.setJframeWechatVisible(true);
                dispose();
            }
        });

        registerJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Register register = new Register();
                register.setJFrameRegisterVisible(true);
               // setVisible(true);
            }
        });

    }

    public void setLoginJFarmeVisible(Boolean visible){setVisible(visible);}

}
