//编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;//字符串数组个数
        System.out.println("想输入字符串数组的个数:");
        n = in.nextInt();
        String[] strings = new String[n];
        System.out.println("输入字符串数组元素：");
        for (int i = 0; i < n; i++)
        {
            strings[i] = in.next();
        }
        String pre=GetCommonString(strings);
        System.out.println("共同前缀为："+pre);
    }
    //寻找相同前缀
    public static String GetCommonString(String[] strings)
        {
            String s = "";
            //先找出最短的字符串
            String mins=getMinString(strings);
            //将最短字符串与其他字符串比较
            for(int i =0;i< mins.length();i++)
            {
                char a=mins.charAt(i);
                //只要有一个字符串第一个字母与其他字符串不相等时，就没有共同前缀
                for (int j=1;j<strings.length;j++)
                {
                    if(a!=strings[j].charAt(i))
                        return s;
                }
                s+=a;
            }
            return s;
        }
     //找出字符串数组数组中最短的字符串
    public static String getMinString(String[] strings)
    {
        String mins=strings[0];//最短字符串
        int min = strings[0].length();//最短字符串的长度
        for (int i = 1; i < strings.length; i++)
        {
            if (min > strings[i].length())
            {
                mins = strings[i];
            }
        }
        return mins;
    }
}

