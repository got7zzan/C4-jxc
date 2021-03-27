//4. 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
package com.itheima.domain;

import java.util.Scanner;

public class Task4 {
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
        System.out.println("请输入滑动窗口k的值:");
        int k=in.nextInt();
        int[] res=WindowMaxElem(num,k);
        System.out.println("各划窗最大值为：");
        for (int re : res)
        {
            System.out.print(re+" ");
        }
    }
    public static int[] WindowMaxElem(int[] num,int k)
    {
        int len=num.length;
        int[] res=new int[num.length-k+1];
        for(int i=0;i<num.length-k+1;i++)
        {
            int max=num[i];
            for(int j=i;j<i+k;j++)
            {
                if(max<num[j])
                {
                    max=num[j];
                }
            }
            res[i]=max;
        }
        return res;
    }
}
