public class Task6 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4,1150);
        Car car = new Car(4,1150,4);
        Truck truck = new Truck(6,15000,2,3000);
        Test test = new Test(vehicle,car,truck);
        test.judge(vehicle,car,truck);
        System.out.println("---------------------------");
        Car car1 = new Car(4,1150,7);
        Truck truck1 = new Truck(6,15000,1,7000);
        Test test1 = new Test(vehicle,car1,truck1);
        test1.judge(vehicle,car1,truck1);
    }
}

class Vehicle{
    int wheels;
    float weight;
    public Vehicle(int wheels,float weight)
    {
        this.wheels=wheels;
        this.weight=weight;
    }

}
class Car extends Vehicle{
    int loader;
    public Car(int wheels,float weight,int loader)
    {
        super(wheels,weight);
        this.loader= loader;
    }
}

class Truck extends Vehicle{
    int loader;
    float payload;
    public Truck(int wheels,float weight,int loader,float payload)
    {
        super(wheels,weight);
        this.loader=loader;
        this.payload=payload;
    }
}

class Test{
    private final Vehicle vehicle;
    private final Car car;
    private final Truck truck;
    public Test(Vehicle vehicle,Car car,Truck truck)
    {
        this.vehicle=vehicle;
        this.car=car;
        this.truck=truck;
    }
    public void judge(Vehicle vehicle,Car car,Truck truck)
    {
        if(car.wheels==4)
        {
            System.out.println("车轮的个数是："+car.wheels+"    "+"车重"+car.weight);
            if(car.loader>0 && car.loader<=5)
            {
                System.out.println("这是一辆小车，能载6人，实载"+car.loader+"人。");
            }
            else
            {
                System.out.println("这是一辆小车，能载6人，实载"+car.loader+"人,你超员了！！！");
            }
        }
        System.out.println("---------------------------");
        if(truck.wheels==6)
        {
            System.out.println("车轮的个数是："+truck.wheels+"    "+"车重"+truck.weight);
            if(truck.loader>0 && truck.loader<=3)
            {
                System.out.println("这是一辆卡车，能载3人，实载"+truck.loader+"人。");
            }
            else if(truck.loader>3)
            {
                System.out.println("这是一辆卡车，能载3人，实载"+truck.loader+"人,你超员了！！！");
            }
            if (truck.payload>0 && truck.payload<=3000)
            {
                System.out.println("这是一辆卡车，核载5000kg，你已装载"+truck.payload+"kg。");
            }
            else if (truck.payload>3000)
            {
                System.out.println("这是一辆卡车，核载5000kg，你已装载"+truck.payload+"kg,你超载了!!!");
            }
        }
    }
}