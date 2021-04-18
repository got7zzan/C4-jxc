//1. 给定一个集合，里面有 1000 个整数，请找出重复次数最多的那 10 个数。
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int[] num = new int[1000];
        for (int i = 0; i < 1000; i++)
        {
            num[i]=(int)(1000*Math.random());
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<1000;i++)
        {
            if(map.containsKey(num[i]))
            {
                map.put(num[i],map.get(num[i])+1);
            }
            else
            {
                map.put(num[i],1);
            }
        }
        System.out.println("出现次数从多到低的10位数为：");
        for(int i=0;i<10;i++)
        {
            //将map中的value全部放到count集合中
            Collection<Integer> count = map.values();
            int maxCount=Collections.max(count);
            //entrySet()方法得到HashMap中各个键值对映射关系的集合
            for (Map.Entry<Integer, Integer> entry : map.entrySet())
            {
                if(maxCount==entry.getValue())
                {
                    System.out.println(entry.getKey()+" ");
                    map.remove(entry.getKey());
                    break;
                }
            }
        }
    }
}
