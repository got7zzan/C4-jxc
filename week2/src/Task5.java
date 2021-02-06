/*
编写一个 Java 应用程序，该程序包括 3 个类：Monkey 类、People 类和主类。要求：
         Monkey 类中有个构造方法：Monkey (String s)，并且有个 public void speak()方法，在 speak
        方法中输出“咿咿呀呀......”的信息。
         People 类是 Monkey 类的子类，在 People 类中重写方法 speak(),在 speak 方法中输出“小
        样的，不错嘛！会说话了！”的信息。
         在 People 类中新增方法 void think()，在 think 方法中输出“别说话！认真思考！”的信
        息。
         在主类的 main 方法中创建 Monkey 与 People 类的对象类测试这 2 个类的功能。
 */

public class Task5 {
    public static void main(String[] args) {
        Monkey monkey = new Monkey("I am a monkey.");
        People people = new People("I am wonderful");

        monkey.speak();
        people.speak();
        people.think();
    }
}

class Monkey{
    public Monkey(String s)
    {
        System.out.println(s);
    }

    public void speak()
    {
        System.out.println("咿咿呀呀......");
    }
}

class People extends Monkey{
    public People(String s) {
        super(s);
    }

    public void speak()
    {
        System.out.println("小样的，不错嘛！会说话了！");
    }

    public void think()
    {
        System.out.println("别说话！认真思考！");
    }
}
