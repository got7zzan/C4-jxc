import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("你想输入的数字个数为：");
        int len = in.nextInt();
        int[] arr = new int[len];
        System.out.println("请输入数字:");
        for(int i =0;i<len;i++)
        {
            arr[i]=in.nextInt();
        }
        //将数组进行排序（默认为升序）
        Arrays.sort(arr);
        System.out.println("请输入你想找出该数组中第k小的数：");
        int k = in.nextInt();
        System.out.println("第"+k+"小的数为："+arr[k-1]);
    }
}
