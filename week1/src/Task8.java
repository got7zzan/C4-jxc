

public class Task8 {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        rabbit.eat();
        rabbit.sleep();

        tiger.eat();
        tiger.sleep();
    }
}

class Animal{
    double height;
    double weight;

    public void eat()
    {
        System.out.println("eat...");
    }

    public void sleep()
    {
        System.out.println("sleep");
    }
}

class Rabbit extends Animal{
   // @Override
    public void eat()
    {
        System.out.println("rabbit eat grass.");
    }
   // @Override
    public void sleep()
    {
        super.sleep();
    }
}

class Tiger extends Animal{
    //@Override
    public void eat()
    {
        System.out.println("tiger eat meat.");
    }
    //@Override
    public void sleep()
    {
        super.sleep();
    }
}
