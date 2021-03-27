//2.给定 pushed 和 popped 两个序列，每个序列中的 值都不重复，只有当它们可能是
// 在最初空栈上进行的推入 push 和弹出 pop 操作序列的结果时，返回 true；否则，返 回 false 。
package com.itheima.domain;

import java.util.Scanner;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入元素个数：");
        int n=in.nextInt();
        System.out.println("请输入push元素:");
        int[] push = new int[n];
        for(int i=0;i<n;i++)
        {
            push[i]=in.nextInt();
        }
        System.out.println("请输入pop元素:");
        int[] pop = new int[n];
        for(int i=0;i<n;i++)
        {
            pop[i]=in.nextInt();
        }
        System.out.println(OrderStack(push,pop));
    }
    public static boolean OrderStack(int[] push,int[] pop)
    {
        int len=push.length;
        Stack<Integer> stack = new Stack<>();
        int j=0;
        for(int i=0;i<len;i++)
        {
            stack.push(push[i]);
            while (!stack.empty() && j<len && stack.peek()==pop[j])
            {
                stack.pop();
                j++;
            }
        }
        return j==len;
    }
}
