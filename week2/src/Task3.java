import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String s = in.nextLine();
        String[] number;
        number = getNumber(s);
        System.out.println("字符串中的数字为：");
        for(int i=0;i< number.length;i++)
        {
            System.out.print(number[i]+" ");
        }
    }
    public static String[] getNumber(String string)
    {
        //将字符串中的每一堆数字提取出来放在temp中，然后将这一堆数字放在s[j]中，以此类推
        String[] s = new String[100];//用来存储字符串中的数字
        String temp="";
        int flag,i=0,j=-1;//i为字符串中的位置，j为字符串中数字的堆数
        //flag的作用我也说不清楚，是写代码过程中试出来的
        for( ;i<string.length(); )
        {
            flag=1;
            while (i<string.length() && flag==1)
            {
                flag=0;
                char a=string.charAt(i);
                i++;
                //因为a是char类型，数字0-9在ASCII码当中为48-57
                if(a>=48 && a<=57)
                {
                    temp+=a;
                    flag=1;
                }
            }
            if(temp!=null)
            {
                j++;
                s[j]=temp;
                temp="";
            }
        }
        //因为s的空间太大，有太多空值，所以只返回不是空值的空间
        String[] s1 = new String[j+1];
        for(int k=0;k<j+1;k++)
        {
            s1[k]=s[k];
        }
        return s1;
    }
}
