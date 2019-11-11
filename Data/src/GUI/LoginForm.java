package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static void main(String[] args){

        JFrame frame = new JFrame("Login Example")  ;

        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        PlaceCompoments(panel);
        frame.setVisible(true);

    }

    public static  void PlaceCompoments(JPanel panel){

        final String COMMAND_LOGIN = "LOGIN";
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JLabel identifyLabel = new JLabel("验证码：");
        identifyLabel.setBounds(10,80,80,25);
        panel.add(identifyLabel);

        JPasswordField identifyText = new JPasswordField(10);
        identifyText.setBounds(100,80,165,25);
        panel.add(identifyText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10,130,80,25);
        loginButton.setActionCommand(COMMAND_LOGIN);
        panel.add(loginButton);

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

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(100,130,90,25);
        panel.add(registerButton);
    }
}
