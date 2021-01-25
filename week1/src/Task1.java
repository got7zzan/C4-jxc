
import java.util.Scanner;

import static java.lang.Math.pow;

public class Task1 {
    public static void main(String[] args) {
        double height,weight,BMI;
        Scanner in = new Scanner (System.in);
        System.out.print("请输入身高(m):");
        height = in.nextDouble();
        System.out.print("请输入体重(kg)：");
        weight = in.nextDouble();
        BMI = weight / pow(height,2);
        if (BMI < 18.5) System.out.println("过轻");
        else if (BMI >= 18.5 && BMI < 25) System.out.println("正常");
        else if (BMI >= 25 && BMI < 28) System.out.println("过重");
        else if (BMI >= 28 && BMI < 32) System.out.println("肥胖");
        else if (BMI >= 32) System.out.println("非常肥胖");
    }
}

