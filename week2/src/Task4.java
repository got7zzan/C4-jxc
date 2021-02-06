/*
猜数字游戏：
         一个类 Game 有一个成员变量 v，v 有一个初值 100。
         定义一个方法 guess，对 Game 类的成员变量 v，用你输入的数字进行猜。
         如果大了则提示大了，小了则提示小了。直到猜对才停止

 */
import java.util.Scanner;

public class Task4 {
    public static class Game{
        int v=100;
        public void guess(int num)
        {
            Scanner in = new Scanner(System.in);
            while ( true )
            {
                if (num>v)
                {
                    System.out.println("猜的有点大，请再试一次吧！");
                    System.out.println("请再次输入数字：");
                    num = in.nextInt();
                }
                else if(num<v)
                {
                    System.out.println("猜的有点小，请再试一次吧！");
                    System.out.println("请再次输入数字：");
                    num = in.nextInt();
                }
                else
                {
                    System.out.println("恭喜猜对了！");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("欢迎来到猜字游戏，请输入一个数：");
        num = in.nextInt();
        game.guess(num);
    }
}
