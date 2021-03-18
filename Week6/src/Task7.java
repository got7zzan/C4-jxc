import java.util.Scanner;

//7.、插入排序、快速排序、合并排序、堆排序

//合并排序和堆排序不知道错哪儿了，最后输出来有错误

//这些排序都是从小到大输出

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入需排序的个数：");
        int n=in.nextInt();
        int[] a = new int[n];
        System.out.println("请输入需排序的数字：");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        //冒泡排序
        BubbleSort(a);
        //插入排序
        InserSore(a);
        //快速排序
        QuickSort(a);
        //合并排序
        MergeSort(a);
        //堆排序
        HeapSort(a);
    }
    //冒泡排序
    /*
    一次冒泡将序列中从头到尾所有元素两两比较，将最大的放在最后面。
    将剩余序列中所有元素再次两两比较，将最大的放在最后面。
    重复第二步，直到只剩下一个数。
     */
    public static void BubbleSort(int[] a)
    {
        int len=a.length-1;
        int temp;
        //需要遍历的次数
        for(int i=0;i<a.length-1;i++)
        {
            //依次比较相邻两个数的大小，每一次遍历将最大值放在后面
            for(int j=0;j<len;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            len--;
        }
        System.out.println("冒泡排序为：");
        for (int i : a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    //插入排序
    /*
    1.遍历数组，每次循环从第二个数字往前插入
    2.设定插入数和得到已经排好序列的最后一个数的位数。temp和j=i-1。
    3.从最后一个数开始向前循环，如果插入数小于当前数，就将当前数向后移动一位
     */
    public static void InserSore(int[] a)
    {
        int temp;
        for(int i=1;i<a.length;i++)
        {
            temp=a[i];
            int j;
            for(j=i-1;j>=0;j--)
            {
                if(a[j]>temp)
                {
                    a[j+1]=a[j];
                }
                else
                {
                    break;
                }
            }
            a[j+1]=temp;
        }
        System.out.println("插入排序为;");
        for (int i : a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    //快速排序
    /*
    1.从数列中挑出一个元素，称为"基准"（pivot）。
    2.重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面（相同的数可以到任一边）。
      在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
     */
    public static void QuickSort(int[] a)
    {
        int temp;
        int low=0;
        int high=a.length-1;
        //一般就用第一个数作为pivot
        int pivot=a[low];
        while (low<high)
        {
            while (low<high && a[high]>pivot)
            {
                high--;
            }
            if(a[high]<pivot)
            {
                temp=a[high];
                a[high]=pivot;
                pivot=temp;
            }
            while (low<high && a[low]<pivot)
            {
                low++;
            }
            if(a[low]>pivot)
            {
                temp=a[low];
                a[low]=pivot;
                pivot=temp;
            }
        }
        System.out.println("快速排序为：");
        for (int i : a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    //合并排序
    public static void MergeSort(int[] a)
    {
        int[] temp = new int[a.length];
        mergeSort(a,0,a.length-1,temp);
        System.out.println("合并排序为：");
        for (int i : a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] a,int left,int right,int[] temp)
    {
        if(left<right)
        {
            int mid=(left+right)/2;
            mergeSort(a,left,mid,temp);//左边归并排序
            mergeSort(a,mid+1,right,temp);//右边归并排序
            Merge(a,left,mid,right,temp);//将两个有序数组归并排序
        }
    }
    public static void Merge(int[] a,int left,int mid,int right,int[] temp)
    {
        int i=left;
        int j=mid+1;
        int fp=0;
        while (i<=mid && j<=right)
        {
            if(a[i]<=a[j])
            {
                temp[fp++]=a[i++];
            }
            else
            {
                temp[fp++]=a[j++];
            }
        }
        while (i<=mid)
        {
            temp[fp++]=a[i++];
        }
        while (j<=right)
        {
            temp[fp++]=a[j++];
        }
        while (left<=right)
        {
            a[left]=temp[left];
            left++;
        }
    }
    //堆排序
    public static void HeapSort(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            heapSort(a,a.length-1-i);
            swap(a,0,a.length-1-i);
        }
        System.out.println("堆排序为：");
        for (int i : a)
        {
            System.out.print(i+" ");
        }
    }
    public static void heapSort(int[] a,int lastindex)
    {
        //从最后一个结点的父结点
        for(int i=(lastindex-1)/2;i>=0;i--)
        {
            int j=i;
            //如果当前k结点的子结点存在
            while (j*2+1<=lastindex)
            {
                //k结点的左子结点的索引
                int biggerIndex=2*j+1;
                if(biggerIndex<lastindex)
                {
                    if(a[biggerIndex]<a[biggerIndex+1])
                    {
                        biggerIndex++;
                    }
                }
                if(a[j]<a[biggerIndex])
                {
                    swap(a,j,biggerIndex);
                    j=biggerIndex;
                }
                else
                {
                    break;
                }
            }
        }
    }
    public static void swap(int[] a,int i,int j)
    {
        int temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
