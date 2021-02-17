import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String s= in.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        //将字符串转为字符串数组
        char[] str = s.toCharArray();
        //遍历字符串
        for (char c : str)
        {
            //使用获取到的字符，判断map中是否存在
            //如果存在，则value++
            if(map.containsKey(c))
            {
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }
            //如果不存在
            else
            {
                map.put(c,1);
            }
        }
        //最后输出结果
        System.out.println("结果为：");
        for (Character key : map.keySet())
        {
            Integer value = map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
