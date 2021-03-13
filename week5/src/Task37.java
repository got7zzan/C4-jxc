import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
3.求子集
给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集
 */
public class Task37 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("请输入数组的大小:");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("请输入元素：");
        for(int i=0;i<n;i++)
        {
            nums[i]=in.nextInt();
        }
        //List<List<Integer>> list = subset.subsets(nums);
        for (List<Integer> subset : subsets(nums))
        {
            System.out.print(subset);
            System.out.print("  ");
        }
    }
    public static List<List<Integer>> subsets(int[] nums)
    {
        //list用来存储最终的子集集合
        List<List<Integer>> list = new ArrayList<>();
        //numlist用来存储每一种子集
        List<Integer> numlist = new ArrayList<>();
        int len=nums.length;
        FindSubset(0,len,nums,list,numlist);
        return list;
    }
    public static void FindSubset(int start, int len, int[] nums, List<List<Integer>> list, List<Integer> numlist)
    {
        if(numlist.size()>start)
        {
            return;
        }
        list.add(new ArrayList<>(numlist));
        for(int i=start;i<len;i++)
        {
            numlist.add((nums[i]));
            FindSubset(i+1,len,nums, list, numlist);
            numlist.remove(numlist.size()-1);
        }
    }
}
