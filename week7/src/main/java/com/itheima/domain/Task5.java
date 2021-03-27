//给定一个二进制数组，计算其中最大连续 1 的个数。
package com.itheima.domain;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组大小：");
        int n =in.nextInt();
        System.out.println("请输入元素：");
        int[] num = new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=in.nextInt();
        }
        int max=MaxOne(num);
        System.out.println("连续的1的最大个数为:"+max);
    }
    public static int MaxOne(int[] num)
    {
        int count=0;
        int result=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==1)
            {
                count++;
            }
            if(result<count)
            {
                result=count;
            }
            if(num[i]!=1)
            {
                count=0;
            }
        }
        return result;
    }
}
