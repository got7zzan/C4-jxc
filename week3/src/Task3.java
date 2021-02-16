/*
现获取到用户输入的一段字符串（可从键盘录入），例如：aaaabbbcccccdd。请编写程序
获取其中无重复的字符组成一个新的字符串，即：abcd。请不要改变字符的输入顺序。
提示：可以利用 set 集合的去重
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String s = in.nextLine();
        //将一个字符串转换成一个Character类的字符数组
        char[] temp = s.toCharArray();

        HashSet<Character> set = new HashSet<>();         /*
                                                           set集合在调用add方法的时候，add方法会调用元素的hashCode方法和
                                                           equals方法判断元素是否重复。
                                                           在集合中找有没有与这个元素相同的哈希值，如果没有，就会存储到set集合中。
                                                           如果有，就会调用equals方法，如果返回true，则不存储，返回false则存储。
                                                           */
        for (char i : temp)
        {
            set.add(i);
        }
        //Set集合不能用for循环遍历，所以用迭代器遍历或者加强for循环
        //加强for循环
        System.out.println("结果为：");
        for(char j:set)
        {
            System.out.print(j);
        }
        /*
        //迭代器遍历
        Iterator<Character> it = set.iterator();
        System.out.println("结果为：");
        while (it.hasNext())
        {
            Character n = it.next();
            System.out.print(n);
        }
         */
    }
}
