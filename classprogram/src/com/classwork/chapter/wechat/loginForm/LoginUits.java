package com.classwork.chapter.wechat.loginForm;

import java.io.*;

/**
 * @program:
 * @Author:Mr.Y
 * @Description:
 * @Data:2019/11/27
 */
public class LoginUits {


    public int Uitsate(String username,String userpassword){
       int result = 3;
        /*先找到用户文件*/
        String filename = "./src/uers/" + username + ".txt";
        File file =  new File(filename);
        if(file.exists()){
            /*读取用户文件，获取用户名和密码*/
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String name = br.readLine();
                String password = br.readLine();
                br.close();
                if(!name.equals(username)){
                    result = 0;
                }
                if(!password.equals(userpassword)){
                    result = 2;
                }
                if(name.equals(username) && password.equals(userpassword)){
                    result = 1;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}