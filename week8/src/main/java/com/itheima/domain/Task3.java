//3.最长单词
//给定一组单词words，编写一个程序，找出其中的最长单词，且该单词由这组单词中的
//其他单词组合而成。若有多个长度相同的结果，返回其中字典序最小的一项，若没有符
//合要求的单词则返回空字符串。
package com.itheima.domain;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组个数:");
        int len = in.nextInt();
        String[] str = new String[len];
        System.out.println("请输入数组元素：");
        for(int i=0;i<len;i++)
        {
            str[i]=in.next();
        }
        String s=LongestWord(str);
        System.out.println("输出为："+s);
    }
    public static String LongestWord(String[] str)
    {
        String temp="";
        for (String s : str)
        {
            //先找出最长单词
            if(s.length()>temp.length() || (s.length()==temp.length() && s.compareTo(temp)<0))
            {
                temp=s;
            }
        }
        Arrays.sort(str);
        int i=0,j=0;
        //再找出是否有单词组成最长单词
        String s="";
        while (i<str.length)
        {
            int n=str[i].length();
            if(j+n<=temp.length())
            {
                String fp=temp.substring(j,j+n);
                if(j+n<=temp.length() && str[i].compareTo(fp)==0)
                {
                    i=0;
                    j=j+n;
                    s=s+str[i];
                }
            }
            i++;
        }
        if(s.compareTo(temp)==0)
        {
            return s;
        }
        else
            return " ";
    }
}
