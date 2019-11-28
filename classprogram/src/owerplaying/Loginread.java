package owerplaying;

import java.io.*;
import java.util.Scanner;

/**
 * @program:
 * @Author:Mr.Y
 * @Description:
 * @Data:2019/11/20
 */
public class Loginread extends LoginInfo{

    public Loginread(){

        Scanner scanner = new Scanner(System.in);

        try{

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D://Yang"));
            System.out.println("输入数据：");
            bufferedWriter.write(scanner.nextLine());
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("D://Yang"));
            String str;
            while ((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
