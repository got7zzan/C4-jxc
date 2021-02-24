/*
在电脑 c 盘的 csatest 目录下，创建一个名称为 demo.txt 的文件。然后将下列内容：
"csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa20
21csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2
021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021"添
加到 demo.txt 中，接着利用 java 程序读取该文件中的内容，计算出总共有多少个 2021,并输出到控制台。
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Task8 {
    public static void main(String[] args) throws Exception{
        //定义要输出的文件路径
        File file = new File("C:\\csatest\\demo.txt");
        //判断文件是否存在后才能进行数据读取
        if(file.exists())
        {
            //用InputStream进行读取
            InputStream input = new FileInputStream(file);
            //准备一个数组
            byte data[] = new byte[1000];
            //进行数据读取，将内容保存到字节数组中
            int len = input.read(data);
            //关闭输入流
            input.close();
            //将读取出来的字节数组数据变为字符串
            String parent = new String(data,0,len);
            //将要查找的2021定义为子字符串
            String child = "2021";
            int count = StringMatch(parent,child);
            System.out.println("2021的个数为"+count);
        }
    }
    public static int StringMatch(String parent,String child)
    {
        int count=0,index=0;
        //indexOf(int ch, int fromIndex) ：
        // 返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。如果不存在则返回 -1。
        while ((index=parent.indexOf(child,index))!=-1)
        {
            count++;
            index+=child.length();
        }
        return count;
    }
}
