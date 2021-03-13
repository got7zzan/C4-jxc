import java.util.Scanner;

/*
1.整数反转
给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
如果反转后整数超过 32 位的有符号整数的范围[−2^31, 2^31− 1] ，就返回 0
 */
public class Task35 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x=in.nextInt();
        int y=IntChange(x);
        System.out.println("反转过后的结果为："+y);
    }
    public static int IntChange(int x)
    {
        int temp=0;
        if(x==0)
        {
            return 0;
        }
        while(x!=0)
        {
            temp=temp*10+x%10;
            x=x/10;
        }
        if(temp>Math.pow(2,31)-1 || temp<-Math.pow(2,31))
        {
            return 0;
        }
        return temp;
    }
}
