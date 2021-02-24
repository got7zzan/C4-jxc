/*
创建两个线程A和B，让他们交替打印0到10的所有整数，其中A线程打印偶数，B线程打印奇数
 */
public class Task10 {
    public static volatile boolean judge = true;
    public static void main(String[] args) {

        Thread threadA = new Thread(new A());
        Thread threadB = new Thread(new B());

        threadA.start();
        threadB.start();
    }
}
class A implements Runnable{

    @Override
    public void run() {
        int i=0;
        while (i<=10)
        {
            if(Task10.judge)
            {
                System.out.println("线程A打印："+i);
                i+=2;
                Task10.judge=false;
            }
            else
            {
                Thread.yield();
            }
        }
    }
}

class B implements Runnable{

    @Override
    public void run() {
        int i=1;
        while (i<=10)
        {
            if(!Task10.judge)
            {
                System.out.println("线程B打印："+i);
                i+=2;
                Task10.judge=true;
            }
            else
            {
                Thread.yield();
            }
        }
    }
}
