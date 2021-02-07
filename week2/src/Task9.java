/*
.接口多态练习
         定义接口 Universe，提供抽象方法 doAnything。
         定义普通类 Star，提供成员发光 shine 方法
         定义普通类 Sun，继承 Star 类，实现 Universe 接口
         测试类中，创建 Star 对象，调用 shine 方法
         测试类中，多态的方式创建 Sun 对象，调用 doAnything 方法，向下转型，调用 shine 方法

 */
public class Task9 {
    public static void main(String[] args) {
//        Star star = new Star();
//        star.shine();
//        System.out.println("===================");
//        //多态的方式创建Sun对象
//        Universe universe = new Sun();
//        //调用doAnything方法
//        universe.doAnything();
//        //向下转型
//        Sun sun = (Sun) universe;
//        sun.shine();
        Test2 test2 = new Test2();
        test2.getShine();
        System.out.println("===================");
        test2.getdoAnything();
        test2.getShine1();
    }
}

interface Universe{
    public abstract void doAnything();
}

class Star{
    public void shine()
    {
        System.out.println("star:星星一闪一闪亮晶晶");
    }
}

class Sun extends Star implements Universe{


    @Override
    public void doAnything()
    {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }

    @Override
    public void shine()
    {
        System.out.println("sun:光照八分钟，到达地球");
    }
}

class Test2{
    Star star = new Star();
    public void getShine()
    {
        star.shine();
    }
    //多态的方式创建Sun对象
    Universe universe = new Sun();
    //调用doAnything方法
    public void getdoAnything()
    {
        universe.doAnything();
    }
    //向下转型（父类转为子类）
    Sun sun = (Sun) universe;//学长答疑时希望讲一下为什么这里不能是Sun sun = (Sun) star，这样会报错
    public void getShine1()
    {
        sun.shine();
    }
}


