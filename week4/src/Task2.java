/*
给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String s = in.nextLine();
        int pos = FistUniqChar(s);
        System.out.println("位置为:"+pos);
    }
    public static int FistUniqChar(String s)
    {
        char[] str = s.toCharArray();
        int len = str.length;
        for(int i =0;i<len;i++)
        {
            int sub=0;
            for(int j=0;j<len;j++)
            {
                if(str[i]==str[j] && i!=j)
                {
                    sub++;
                    break;
                }
            }
            if(sub==0)
            {
                return i;
            }
        }
        return -1;
    }
}
