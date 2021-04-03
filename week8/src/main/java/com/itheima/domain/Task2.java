//2.验证回文字符串
//给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
package com.itheima.domain;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串s:");
        String s = in.nextLine();
        char[] str = s.toCharArray();
        boolean temp = isPalindrome(str);
        System.out.println(temp);
    }
    public static boolean isPalindrome(char[] str) {
        int i = 0;
        int j = str.length - 1;
        while (i < j)
        {
            if (str[i] != str[j])
            {
                if (str.length % 2 == 0)
                {
                    for (int k = str.length / 2; k < str.length-1; k++)
                    {
                        str[k] = str[k + 1];
                    }
                    int m = 0, n = str.length - 2;
                    while (m < n)
                    {
                        if (str[m] == str[n])
                        {
                            m++;
                            n--;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}
