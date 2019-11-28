package com.classwork.chapter.wechat.register;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @program:
 * @Author:Mr.Y
 * @Description:
 * @Data:2019/11/28
 */
public class RegisterUilts {

    public int regisata(String username,String userpassword){
            int result = 0;
            String filename =  "./src/uers/" + username + ".txt";
            File file = new File(filename);
            try{
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(username + "\n");
                bufferedWriter.write(userpassword);
                bufferedWriter.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        return result;
    }
}
