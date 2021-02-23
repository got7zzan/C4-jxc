/*
给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
解决思路：
   将原先的每个字符串转换成字符数组排序后组成新的字符串，新字符串相同时说明是一组，
   用HashMap的键-值来分组，键为排序后的字符串，值为排序后与键相同的原字符串，
   最后将所有值（也就是未排序的原字符串按键分组）的列表返回。
 */
import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串数组个数：");
        int n = in.nextInt();
        String[] arr = new String[n];
        System.out.println("请输入元素：");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.next();
        }
        List list=CommonElem(arr);
        System.out.println(list);

    }
    public static List<List<String>> CommonElem(String[] arr) {
        Map<String, List> map = new HashMap<>();
        for (String str : arr) {
            char[] s = str.toCharArray();
            Arrays.sort(s);
            //valueOf()删除头尾空白符的字符串
            // arr = {'r', 'u', 'n', 'o', 'o', 'b' };
            //String.valueOf(arr) --> runoob
            String temp = String.valueOf(s);
            //containsKey方法——判断是否包含指定的键名
            if (!map.containsKey(temp)) {
                map.put(temp, new ArrayList<>());

            }
            map.get(temp).add(str);
        }
        return new ArrayList(map.values());
    }
}
