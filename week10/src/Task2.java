import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//2. 约瑟夫环问题：圆圈中最后剩下的数字
//0,1,···,n-1 这 n 个数字排成一个圆圈，从数字 0 开始，每次从这个圆圈里删除第 m 个数字（删
//除后从下一个数字开始计数）。求出这个圆圈里剩下的最后一个数字
public class Task2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("请输入n的值:");
        int n=in.nextInt();
        System.out.println("请输入m的值:");
        int m=in.nextInt();
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            list.add(i);
        }
        int index=0;
        System.out.println("删除的顺序为：");
        while (list.size()>1)
        {
            for(int i=1;i<m;i++)
            {
                index=(index+1)%list.size();
            }
            System.out.print(list.remove(index)+" ");
        }
        System.out.println();
        System.out.println("最后剩下的数字为："+list.get(0));
    }
}