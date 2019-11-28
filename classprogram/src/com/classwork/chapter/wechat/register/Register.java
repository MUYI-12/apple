package com.classwork.chapter.wechat.register;

import com.classwork.chapter.wechat.loginForm.LoginForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program:Register
 * @Author:Mr.Y
 * @Description:
 * @Data:2019/11/17
 */
public class Register extends JFrame {
    private JPanel RegisterJPanel;
    private JLabel userJLabel;
    private JTextField userText;
    private JLabel passwordJLabel;
    private JTextField passwordText;
    private JButton backJButton;
    private JButton registerJButton;

    public Register(){
        setTitle("Register Form");
        setSize(300,190);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RegisterJPanel = new JPanel();
        RegisterJPanel.setLayout(null);

        userJLabel = new JLabel("Username:");
        userJLabel.setBounds(10,10,80,25);
        RegisterJPanel.add(userJLabel);

        userText = new JTextField(10);
        userText.setBounds(100,10,165,25);
        RegisterJPanel.add(userText);

        passwordJLabel = new JLabel("Password:");
        passwordJLabel.setBounds(10,50,80,25);
        RegisterJPanel.add(passwordJLabel);

        passwordText = new JTextField(10);
        passwordText.setBounds(100,50,165,25);
        RegisterJPanel.add(passwordText);

        backJButton = new JButton("Back");
        backJButton.setBounds(100,90,80,25);
        RegisterJPanel.add(backJButton);

        registerJButton = new JButton("Register");
        registerJButton.setBounds(10,90,80,25);
        RegisterJPanel.add(registerJButton);

        add(RegisterJPanel);

        backJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                LoginForm loginForm = new LoginForm();
                loginForm.setLoginJFarmeVisible(true);
            }
        });

        registerJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                RegisterUilts registerUilts = new RegisterUilts();
                String username = userText.getText();
                String userpassword = passwordText.getText();
                int result = registerUilts.regisata(username,userpassword);
                if(result == 0){
                    //  WeformRegis weformRegis = new WeformRegis();
                    //  weformRegis.setWeformRegisVisible(true);
                }

            }
        });

    }
    public void setJFrameRegisterVisible(Boolean visible){setVisible(visible);}

}
