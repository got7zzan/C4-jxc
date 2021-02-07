import java.util.Scanner;

//宠物商店
public class Task11 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("欢迎来到宠物商店！");
        PetShop petshop = new PetShop(5);
        Cat cat1 = new Cat(" 波斯猫",2);
        Cat cat2 = new Cat("波米拉猫",1);
        Cat cat3 = new Cat("加菲猫",3);
        Dog dog1 = new Dog("波尔多",3);
        Dog dog2 = new Dog("松狮",2);
        petshop.add(cat1);
        petshop.add(cat2);
        petshop.add(cat3);
        petshop.add(dog1);
        petshop.add(dog2);
        //删除宠物信息
        petshop.delete(cat2);
        System.out.println("请输入你想搜索的关键词或字：");
        String key = in.next();
        print(petshop.search(key));
    }
    public static void print(Pet[] pet)
    {
        if(pet.length>0)
        {
            System.out.println("搜索出来为：");
        }
        else
            System.out.println("该店没有。");
        for(int i=0;i<pet.length;i++)
        {
            System.out.println(pet[i].toString());
        }
    }
}

interface Pet{
    public String getName();
    public int getAge();
}
//宠物商店
class PetShop {
    Pet[] pets;
    int i = 0;

    //商店有多少宠物由用户决定
    public PetShop(int len) {
        pets = new Pet[len];
    }

    //加入宠物信息
    public void add(Pet pet) {
        this.pets[i] = pet;
        i++;
    }

    //删除宠物信息
    public void delete(Pet pet) {
        //先找到与要删除宠物相同的，然后再将其他宠物往前移
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].equals(pet)) {
                for (int j = i; j < pets.length - 1; j++) {
                    pets[j] = pets[j + 1];
                }
            }
        }
    }

    //寻找宠物
    public Pet[] search(String keyword) {
        Pet[] result;
        int count = 0;
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].getName().indexOf(keyword) != -1 ) {
                count++;
            }
        }
        result = new Pet[count];
        int j = 0;
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].getName().indexOf(keyword) != -1 ) {
                result[j] = pets[i];
                j++;
            }
        }
        return result;
    }
}

class Cat implements Pet{
    String name;
    int age;
    public Cat(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public String toString()
    {
        return "猫的名字:"+this.getName()+",年龄："+this.getAge();
    }
}

class Dog implements Pet{
    String name;
    int age;
    public Dog(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public String toString()
    {
        return "狗的名字:"+this.getName()+",年龄："+this.getAge();
    }
}
