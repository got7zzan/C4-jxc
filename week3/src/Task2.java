import java.util.ArrayList;
import java.util.List;

import static java.sql.Types.NULL;

public class Task2 {
    public static void main(String[] args) {
        Message message1 = new Message(1,"Joe",70000,3);
        Message message2 = new Message(2,"Henry",80000,4);
        Message message3 = new Message(3,"Sam",60000,NULL);
        Message message4 = new Message(4,"Max",90000,NULL);

        List<Message> list = new ArrayList<Message>();
        list.add(message1);
        list.add(message2);
        list.add(message3);
        list.add(message4);
        System.out.println("id\tname\tsalary\tmanagerld\t");
        for(Message temp:list)
            System.out.println(temp);
    }
}
class Message{
    int id;
    String name;
    int salary;
    int managerId;
    public Message()
    {
        super();
    }
    public Message(int id, String name, int salary, Integer managerId)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.managerId = managerId;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getSalary()
    {
        return salary;
    }
    public int getManagerId()
    {
        return managerId;
    }
    public String toString()
    {
        return id+"\t"+name+"\t  "+salary+"\t      "+managerId;
    }
}