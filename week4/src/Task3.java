/*
编写一个程序，实现将小数转为分数的功能

解题思路：
    假如输入的小数为1.35，先将小数分为整数部分和小数部分，整数部分为1，小数部分转换为分数为35/100，
    然后找最大公约数，约分成最简分数为7/20，最后将整数部分加到分子上去，最后就得到了27/20.
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数字：");
        //首先想到的是以double形式输入这个小数number，整数部分a直接用int得到，
        // 需要转成分数的小数点后的数，用number减去a。但是发现，这样会出现浮点数错误的情况（因为计算机的计算原理）
        //所以不得不以String的形式输入number
        String number = in.next();
        String[] arr = new String[2];
        //提取整数和小数部分
        arr = number.split("\\.");
        int integer = Integer.parseInt(arr[0]);
        int decimal = Integer.parseInt(arr[1]);
        int len=arr[1].length();
        int percent = (int) Math.pow(10,len);
        //求最大公约数
        int d = devide(decimal,percent);
        //对分子进行约分
        int molecule = decimal/d;
        //对分母进行约分
        int denominator = percent/d;
        //将整数部分加到分子上
        int change = integer*denominator+molecule;
        System.out.println(number+"转化为分数为"+change+"/"+denominator);
    }
    public static int devide(int decimal,int percent)
    {
        int max=1;
        //寻找最大公约数
        for(int i=2;i<=decimal;i++)
        {
            if(percent%i==0 && decimal%i==0)
            {
                max=i;
            }
        }
        return max;
    }
}
