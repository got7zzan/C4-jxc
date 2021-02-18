/*
自定义一个异常类，然后在发生异常时能调用到你自定义的异常类
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数:");
        int n = in.nextInt();
        Div div = new Div();
        div.getDiv(n);
    }
}
class Div{
    public static void getDiv(int n){
        try
        {
            int i=7/n;
        }
        catch (Exception e)
        {
            try
            {
                throw new Exception("发生了除0错误。");
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return;
            }
        }
        System.out.println("一切进行正常。");
    }
    }

