import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {
    ArrayList<String> notes = new ArrayList<String>();

    public void add(String s)
    {
        notes.add(s);
    }
    public void add(int location,String s)
    {
        notes.add(location,s);
    }
    public int getSize()
    {
        return notes.size();
    }
    public String getNote(int index)
    {
        return notes.get(index);
    }
    public String removeNote(int index)
    {
        return notes.remove(index);
    }
    public String[] list()
    {
        String[] a = new String[notes.size()];
       // for (int i=0;i<notes.size();i++)
        //{
          //  a[i]=notes.get(i);
        //}
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
        Task8 nb = new Task8();
        nb.add("first");
        nb.add("seconde");
        nb.add(1,"third");
        //System.out.println(nb.getNote(1));
        nb.removeNote(2);
        String[] a = nb.list();
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
