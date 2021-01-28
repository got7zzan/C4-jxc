import java.util.Scanner;

public class Task5 {
    public static class Circle{
        double radius;//圆的半径
        double pai = 3.14;

        public Circle(double radius) {
            this.radius=radius;
        }

        public double getArea(double radius)
        {
            return pai * radius * radius;
        }

        public double getPerimeter(double radius)
        {
            return 2*pai*radius;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = 0;
        System.out.println("请输入圆的半径：");
        radius=in.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("the area is "+circle.getArea(radius));
        System.out.println("the perimeter is "+circle.getPerimeter(radius));
    }
}
