import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int len = in.nextInt();
        int[] nums = new int[len];
        System.out.println("请输入数组元素:");
        for(int i=0;i<len;i++)
        {
            nums[i]= in.nextInt();
        }
        System.out.println("请输入target：");
        int target = in.nextInt();
        List<List<Integer>> num = threeSum(nums,target);
        System.out.println("输出：");
        System.out.println(threeSum(nums,target));
    }

    public static List<List<Integer>> threeSum(int[] nums, int target)
    {
        List<List<Integer>> num = new ArrayList<>();
        //先对nums进行升序排序
        Arrays.sort(nums);
        for (int i = 0;i<nums.length-2;i++)
        {
            //如果nums[i]>0，则直接结束，因为是升序排序的
            if(nums[i]>0)
                break;
            int left = i+1,right = nums.length-1;
            while (left < right)
            {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == target)
                {
                    //Arrays.asList将数组转为List
                    num.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left<right && nums[left] == nums[left+1])
                        left++;
                    while (left<right && nums[right] == nums[right-1])
                        right--;
                    left++;
                    right--;
                }
                //大于则左移
                else if(sum>target)
                    right--;
                //小于则右移
                else
                    left++;
            }
        }
        //会存在重复项，所以去重
        for(int i=0;i<num.size()-1;i++)
        {
            for(int j=num.size()-1;j>i;j--)
            {
                if(num.get(j).equals(num.get(i)))
                    num.remove(j);
            }
        }
        return num;
    }
}
