/*
抽象类练习题
         定义抽象类 A，抽象类 B 继承 A，普通类 C 继承 B  A 类中，定义成员变量 numa，赋值为 10，抽象 showA 方法。
         B 类中，定义成员变量 numb，赋值为 20，抽象 showB 方法。
         C 类中，定义成员变量 numc，赋值为 30，重写 showA 方法，打印 numa，重写 showB
           方法，打印 numb，定义 showC 方法，打印 numc。
         测试类中，创建 C 对象，调用 showA 方法，showB 方法，showC 方法。

 */
public class Task8 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.getShowA();
        test.getShowB();
        test.getShowC();

    }
}

abstract class A{
    int numa=10;
    public abstract void showA();
}

abstract class B extends A{
    int numb=20;
    public abstract void showB();
}

class C extends B{
    int numc=30;
    @Override
    public void showA()
    {
        System.out.println("A类中numa:"+numa);
    }

    @Override
    public void showB()
    {
        System.out.println("B类中numb:"+numb);
    }
    public void showC()
    {
        System.out.println("C类中numc:"+numc);
    }
}

class Test1{
    C c = new C();

    public void getShowA()
    {
        c.showA();
    }

    public void getShowB()
    {
        c.showB();
    }

    public void getShowC()
    {
        c.showC();
    }
}
