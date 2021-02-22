/*
输入一个原字符串（string）和子串（pattern），要求返回子串在原字符串中首次出现的位置。
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个原字符串：");
        String str = in.nextLine();
        System.out.println("请输入一个子字符串：");
        String str_child = in.nextLine();
        int pos = StringMatch(str,str_child);
        System.out.println("匹配的位置为："+pos);
    }
    //蛮力法
    public static int StringMatch(String str,String str_child)
    {
        //将字符串转为字符串数组
        char[] s = str.toCharArray();
        char[] child = str_child.toCharArray();

        int len = s.length;
        int len_child = child.length;

        for(int i=0;i<len-len_child+1;i++)
        {
            int j=0;
            while (j<len_child && child[j]==s[i+j])
            {
                j++;
            }
            if(j==len_child)
            {
                return i;
            }
        }
        return -1;
    }
}
