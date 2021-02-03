//给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入n的大小：");
        int n = in.nextInt();

        int[][] matrix = new int[n][n];
        //元素输入的顺序为矩阵从左到右从上到下
        System.out.println("请输入矩阵元素：");
        matrix=getElem(matrix,n);

        System.out.println("旋转前的矩阵：");
        print(matrix,n);

        //开始旋转矩阵
        matrix=rotate(matrix,n);

        System.out.println("旋转后的矩阵：");
        print(matrix,n);
    }
    //获取矩阵元素
    public static int[][] getElem(int[][] matrix, int n)
    {
        Scanner in = new Scanner(System.in);
        for ( int i = 0;i<n;i++)
        {
            for ( int j = 0;j<n;j++)
            {
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;
    }
    //将矩阵打印出来
    public static void print(int[][] matrix,int n)
    {
        for(int i = 0; i<n; i++)
        {
            for( int j =0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" "+"\t");
            }
            System.out.println();
        }
    }
    //先把最外围的旋转，以此类推
    //一共有n/2个内外围
    public static int[][] rotate(int[][] matrix,int n )
    {
        int temp;
        for (int i = 0; i < n / 2; i++)
        {
            for (int j = i; j < n - 1 - i; j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
        return  matrix;
    }
}
