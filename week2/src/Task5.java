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
