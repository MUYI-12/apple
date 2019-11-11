package GUI2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginForm extends JFrame {

    private JPanel panelLogin;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;


    LoginForm(){
        final String COMMAND_LOGIN = "LOGIN";

        setTitle("Login Form");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelLogin = new JPanel();
        panelLogin.setLayout(null);

        userLabel = new JLabel("User:");
        userLabel.setBounds(10,20,80,25);
        panelLogin.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panelLogin.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panelLogin.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panelLogin.add(passwordText);

        loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.setActionCommand(COMMAND_LOGIN);
        panelLogin.add(loginButton);

        add(panelLogin);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String command = actionEvent.getActionCommand();

                if (COMMAND_LOGIN.equals(command)){
                    System.out.println("ok按钮被点击");
                    JOptionPane.showConfirmDialog(null,"标题【出错】","请输入数字", JOptionPane.ERROR_MESSAGE);
                }else{
                    System.out.println("Cannel按钮被返回");
                }
            }
        };
        loginButton.addActionListener(actionListener);
    }

    void setFrameLoginVisible(Boolean visible){
        setVisible(visible);
    }

}
