import jdk.jfr.events.FileReadEvent;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task9 {
    public static void main(String[] args) {
        //创建对象
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("C:\\csatest\\demo.txt");
            writer = new FileWriter("C:\\csatest2\\demo2.txt");
            int len;
            //逐个读取字符，然后逐个写入demo2文件中
            while ((len=reader.read())!=-1)
            {
                writer.write(len);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(reader!=null)
                {
                    reader.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            try
            {
                if(writer!=null)
                {
                    writer.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
