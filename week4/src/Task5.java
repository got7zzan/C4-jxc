/*
数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。
 */
import java.util.*;

public class Task5 {
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
        Arrays.sort(arr);
        int num = MaxElem(arr);
        System.out.println("主要元素为:"+num);
        }
        public static int MaxElem(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++)
            {
                //getOrDefault(key, defaultValue)从map中去取一个值的时候，
                // 如果该值存在，那么就返回该值对应的value，反之如果不存在，那么将会返回默认值：defaultvalue
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                if (map.get(arr[i]) > arr.length / 2)
                {
                    return arr[i];
                }
            }
            return -1;
        }
}
