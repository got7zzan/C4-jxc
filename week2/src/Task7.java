/*
.模拟农学院动物医疗系统信息。
         定义抽象家禽类(Poultry)
        (1)私有成员变量：动物种类(name)，症状(symptom)，年龄(age)， 病因（illness）
        (2)提供空参和带参构造方法
        (3)成员方法：
        ①抽象方法症状(showSymptom)
        ②普通方法基本信息(showMsg)
        ③提供 setXxx 和 getXxx 方法
         定义普通鸭子类(Duck)继承家禽类(Poultry)
        (1)提供空参和带参构造方法
        (2)重写 showSymptom 方法，打印症状信息。
 */
public class Task7 {
    public static void main(String[] args) {
        Duck duck = new Duck("鸭子","发烧",2,"感冒");
        System.out.println("症状：");
        duck.showSymptom("感冒");
        System.out.println();
        System.out.println("基本信息：");
        duck.showMsg();
    }
}
//定义抽象家禽类(Poultry)
abstract class Poultry{
    //私有成员变量
    private String name;
    private String symptom;
    private int age;
    private String illness;
    //空参构造方法
    public Poultry()
    {

    }
    //带参构造方法
    public Poultry(String name,String symptom,int age,String illness)
    {
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }
    //抽象方法症状
    public abstract void showSymptom(String symptom);
    //普通方法基本信息
    public void showMsg()
    {
        System.out.println("动物种类："+name+",年龄："+age+"岁。");
        System.out.println("入院原因："+illness);
        System.out.println("症状为："+symptom);
    }
    //提供 setXxx 和 getXxx 方法
    //setName ******* getName
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    //setSymptom ******* getSymptom
    public void setSymptom(String symptom)
    {
        this.symptom = symptom;
    }

    public String getSymptom()
    {
        return symptom;
    }

    //setAge ******* getAge
    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    //setIllness ******* getIllness
    public void setIllness(String illness)
    {
        this.illness = illness;
    }

    public String getIllness()
    {
        return illness;
    }
}
//定义普通鸭子类(Duck)继承家禽类(Poultry)
class Duck extends Poultry{
    //提供空参构造方法
    public Duck()
    {

    }
    //提供带参构造方法
    public Duck(String name,String symptom,int age,String illness)
    {
        super(name,symptom,age,illness);
    }
    //重写 showSymptom 方法，打印症状信息。
    @Override
    public void showSymptom(String symptom) {
        System.out.println("症状为："+symptom);
    }

}
