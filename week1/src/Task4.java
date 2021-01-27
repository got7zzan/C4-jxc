import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i,k=0;

        System.out.println("你想输入数组的个数为：");
        k=in.nextInt();

        int[] nums = new int[k];

        //输入数组元素
        System.out.println("你想输入数组的元素为：");
        for (i=0;i<k;i++)
        {
            nums[i]=in.nextInt();
        }
        System.out.println("调整前的数据元素为：");
        for(i=0;i<k;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        //开始查找不为0的元素
        int got=0,temp=0;
        for(temp=0;temp<k;temp++)
        {
            if(nums[temp]!=0)
            {
                nums[got]=nums[temp];
                got++;
            }

        }
        //将剩余的元素为补充为0
        for(i=got;i<k;i++)
        {
            nums[i]=0;
        }

        System.out.println("调整过后的数组为：");
        for(i=0;i<k;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
