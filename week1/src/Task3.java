import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("输入字符串为：");
        String s = in.nextLine();
        System.out.println("转换前的字符串为：");
        System.out.println(s);

        //将字符串s转换为字符数组strings
        char[] strings = s.toCharArray();

        int i,j;
        char temp;

        for( i=0, j=strings.length-1; i<strings.length/2; i++,j--)
        {
            temp=strings[i];
            strings[i]=strings[j];
            strings[j]=temp;
        }

        /*
        //或者用另一个方法，申请一个新的字符串数组
        int k= strings.length-1;
        char[] change = new char[strings.length];
        for(i=0;i< change.length;i++)
        {
            change[i]=strings[k];
            k--;
        }
        String s1 = new String(change);

         */

        //将字符串数组转化为字符串
        String s1 = new String(strings);
        System.out.println("转换后的字符串为：");
        System.out.println(s1);
    }
}
