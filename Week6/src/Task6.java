import java.util.Scanner;

//6给你一个m行n列的矩阵 matrix,请按照顺时针螺旋顺序,返回矩阵中的所有元素。
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入m,n的值：");
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] a = new int[m][n];
        System.out.println("请输入元素：");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = in.nextInt();
            }
        }
        ChangeOrder(a);
    }
    public static void ChangeOrder(int[][] a)
    {
        int top=0;
        int bottom= a.length-1;
        int left=0;
        int right=a[0].length-1;
        while(top<(a.length+1)/2 && left<(a[0].length+1)/2)
        {
            //上面从左到右
            for(int i=left;i<right+1;i++)
            {
                System.out.print(a[top][i]+",");
            }
            //右边从上到下
            for(int i=top+1;i<a.length && (left+1)!=right && left!=right;i++)
            {
                System.out.print(a[i][right]+",");
            }
            //下面从右到左
            for(int i=right-1;top!=bottom && i>=left;i--)
            {
                System.out.print(a[bottom][i]+",");
            }
            //左边从下到上
            for(int i=bottom-1;left!=right && i>=top+1;i--)
            {
                System.out.print(a[i][left]+",");
            }
            top++;
            bottom--;
            left++;
            right--;
        }
    }
}














