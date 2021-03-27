//3. 给你一个整数数组nums 。数组中唯一元素是那些只出现恰好一次的元素。请你返回
//nums中唯一元素的和。
package com.itheima.domain;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Task3 {
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
        int sum=UniqueElemSum(num);
        System.out.println("唯一元素之和为："+sum);
    }
    public static int UniqueElemSum(int[] num)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int j=0;
        for(int i=0;i<num.length;i++)
        {
            if(map.containsKey(num[i]))
            {
                int now=map.get(num[i]);
                map.put(num[i],++now);
            }
            else
            {
                map.put(num[i],1);
            }
        }
        int sum=0;
        Set<Integer> set= map.keySet();
        for (Integer elem : set)
        {
            if(map.get(elem)==1)
            {
                sum+=elem;
            }
        }
        return sum;
    }
}
