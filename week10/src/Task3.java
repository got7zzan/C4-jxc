//某商场周年庆举办了一次抽奖活动：n 个人参与抽奖，每人抽到一个初始序号
//a[i]，如果 a[i]是某个数的平方，那么这个人就能够获奖。
//现在商场为了吸引人流量，决定发放一些修改劵，修改劵的作用是：能使序号
//a[i]加一或者减一。问：如果要使至少一半的人获奖，商场最少需要发放多少修改劵。
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=in.nextInt();
        }
        int[] temp=minChange(num);
        int total=0;
        int i;
        for(i=0;i<temp.length/2;i++)
        {
            total+=temp[i];
        }
        if(n%2!=0)
        {
            total+=temp[i];
        }
        System.out.println("total"+total);
    }
    public static int[] minChange(int[] num)
    {
        int pos=1;
        int low=1,high=1;
        int[] res=new int[num.length];
        for(int i=0;i<num.length;i++)
        {
            while (!(num[i]>=low && num[i]<high))
            {
                low=high;
                pos++;
                high=pos*pos;
            }
            int a=Math.min(num[i]-low,high-num[i]);
            res[i]=a;
            System.out.println(a);
        }
        Arrays.sort(res);
        return res;
    }
}
