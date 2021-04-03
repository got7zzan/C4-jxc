//1.二进制转字符串
//给定一个介于0和1之间的实数（如0.72），类型为double，打印它的二进制表达式。如果该 数字无法精确地用32位以内的二进制表示，则打印“ERROR”。
package com.itheima.domain;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个0-1的数字:");
        double num=in.nextDouble();
        StringBuilder temp = new StringBuilder();
        temp.append("0.");
        while (true)
        {
            double nums=num*2;
            if(temp.length()>=32)
            {
                System.out.println("ERROR");
                return;
            }
            if(nums>1)
            {
                temp.append(1);
                num=nums-1;
            }
            else if(nums<1 && nums >0)
            {
                temp.append(0);
                num=nums;
            }
            else if(nums==1)
            {
                temp.append(1);
                break;
            }
        }
        System.out.println("二进制为："+temp.toString());
    }
}
