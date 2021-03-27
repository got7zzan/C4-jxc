//1.给你两个没有重复元素的数组 nums1和 nums2 ，其中nums1 是 nums2 的子集。
//请你找出 nums1 中每个元素在 nums2 中的下一个比其大的值。
package com.itheima.domain;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入子集元素的个数：");
        int n1 = in.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("请输入父集元素的个数：");
        int n2 = in.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("请输入子集元素：");
        for (int i = 0; i < n1; i++) {
            nums1[i] = in.nextInt();
        }
        System.out.println("请输入父集元素：");
        for (int i = 0; i < n2; i++) {
            nums2[i] = in.nextInt();
        }
        int[] res = NextElem(nums1, nums2);
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
    public static int[] NextElem(int[] nums1,int[] nums2)
    {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] temp = new int[nums1.length];
        for(int i=0;i<nums2.length;i++)
        {
            while (!stack.empty() && nums2[i]>stack.peek())
            {
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while (!stack.empty())
        {
            map.put(stack.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++)
        {
            temp[i]=map.get(nums1[i]);
        }
        return temp;
    }
}
