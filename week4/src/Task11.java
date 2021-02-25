/*
生产者与消费者案例
 */

public class Task11 {
    public static void main(String[] args) {
            Resource resource = new Resource();
            Producer producer = new Producer(resource);
            Consumer consumer = new Consumer(resource);

            Thread t1 = new Thread(producer);
            Thread t2 = new Thread(consumer);

            t1.start();
            t2.start();

    }
}
class Resource
{
    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name)
    {
        while(flag)
            try
            {
                this.wait();
            }
        catch(InterruptedException e)
        {
        }

        this.name = name + count;
        count++;//2 3 4
        System.out.println(Thread.currentThread().getName()+"    生产者    "+this.name);
        flag = true;
        notifyAll();
    }

    public synchronized void out()
    {
        while(!flag)
            try
            {
                this.wait();
            }
        catch(InterruptedException e)
        {
        }
        System.out.println(Thread.currentThread().getName()+"     消费者     "+this.name);
        flag = false;
        notifyAll();
    }
}
//生产者
class Producer implements Runnable
{
    private Resource resource;
    Producer(Resource resource)
    {
        this.resource = resource;
    }
    public void run()
    {
        while(true)
        {
            resource.set("车厘子");
        }
    }
}
//消费者
class Consumer implements Runnable
{
    private Resource resource;
    Consumer(Resource resource)
    {
        this.resource = resource;
    }
    public void run()
    {
        while(true)
        {
            resource.out();
            System.out.println();
        }
    }
}



