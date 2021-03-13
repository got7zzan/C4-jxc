import java.util.Scanner;
/*
爬楼梯
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

分析：
一阶楼梯：1种方法
两阶楼梯：2种方法
三阶楼梯：3种方法
四阶楼梯：5种方法
五阶楼梯：8种方法
六阶楼梯：13种方法
则第n层=n-1层+n-2层的方法数
 */
public class Task36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n=in.nextInt();
        int sum=ClimbStairs(n);
        System.out.println("有"+sum+"种方法可以爬到楼顶。");
    }
    public static int ClimbStairs(int n)
    {
        int temp=0;
        int step1=1;
        int step2=2;
        if(n<=2)
        {
            return n;
        }
        else
        {
            for(int i=1;i<n-1;i++)
            {
                temp=step1+step2;
                step1=step2;
                step2=temp;
            }
            return temp;
        }
    }
}
