/*
（1）从任务描述以及程序的运行结果分析可知，次任务中设计到的对象有 USB 接口、鼠标、
        键盘、麦克风以及计算机。要实现此程序，就需要对这些对象进行相应的定义。
        （2）首先，鼠标、键盘、麦克风这些 USB 设备只有插入到接口中才能够使用，所以需要先
        定义一个 USB 接口。由于这些 USB 设备需要随着计算机的启动而启动，并随着计算机的关
        闭而关闭，所以需要在接口中定义设备启动和关闭的方法。
        （3）编写完接口后，接下来就要编写接口的实现类鼠标、键盘、麦克风，在实现类中要实
        现这些设备的启动和关闭方法。
        （4）由于这些设备是在计算机中使用的，所以接下来需要编写一个计算机类。计算机中有
        了 USB 插槽后，才能插入 USB 接口，每次插入一个新的设备，计算机都会安装此设备的驱
        动。驱动安装后，设备才能够正常使用，所以该类中还需要编写一个 USB 插槽和安装 USB
        设备的方法。同时计算机要想开关机，还要定义开机和关机的方法。
        （5) 最后编写测试类，实例化计算机对象，并向计算机对象中添加 USB 设备，运行查看结
        果

 */
public class Task10 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse mouse = new Mouse();
        KeyBoard keyBoard = new KeyBoard();
        Microphone microphone = new Microphone();
        computer.Add(mouse);
        computer.Add(keyBoard);
        computer.Add(microphone);
        computer.PowerOn();
        System.out.println("----------------");
        computer.PowerOff();
    }
}
//USB接口
interface USB{
    public void turnOn();
    public void turnOff();
}
//实现类鼠标
class Mouse implements USB{

    @Override
    public void turnOn()
    {
        System.out.println("鼠标启动了");
    }

    @Override
    public void turnOff()
    {
        System.out.println("鼠标关闭了");
    }
}
//实现类键盘
class KeyBoard implements USB{

    @Override
    public void turnOn()
    {
        System.out.println("键盘启动了");
    }

    @Override
    public void turnOff()
    {
        System.out.println("键盘关闭了");
    }
}
//实现类麦克风
class Microphone implements USB{

    @Override
    public void turnOn()
    {
        System.out.println("麦克风启动了");
    }

    @Override
    public void turnOff()
    {
        System.out.println("麦克风关闭了");
    }
}
//计算机类
class Computer{
    USB[] usbadd = new USB[4];
    int i=0;
    //安装USB
    public void Add(USB usb)
    {
        //源代码这里有错，这样只会让usbadd字符串数组都为鼠标（或键盘或麦克风）
//        for( int i=0 ; i<usbadd.length;i++)
//        {
//            if(usbadd[i]==null)
//            {
//                usbadd[i]=usb;
//            }
//        }
        usbadd[i]=usb;
        i++;
    }
    //开机
    public void PowerOn()
    {
        for (int i=0;i<usbadd.length;i++)
        {
            if(usbadd[i]!=null)
            {
                usbadd[i].turnOn();
            }
        }
        System.out.println("电脑开机成功");
    }
    //关机
    public void PowerOff()
    {
        for (int i=0;i<usbadd.length;i++)
        {
            if(usbadd[i]!=null)
            {
                usbadd[i].turnOff();
            }
        }
        System.out.println("电脑关机成功");
    }
}