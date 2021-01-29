import java.util.Scanner;

public class Task7 {
    public static class Plural{
        int shi,xu;
        public Plural(int shi,int xu)
        {
            this.shi=shi;
            this.xu=xu;
        }
        //相加
        public Plural add(Plural num)
        {
            return new Plural(this.shi+num.shi,this.xu+num.xu);
        }
        //相减
        public Plural reduce(Plural num)
        {
            return new Plural(this.shi-num.shi,this.xu-num.xu);
        }
        //相乘
        public Plural multiply(Plural num)
        {
            return new Plural(this.shi*num.shi-this.xu*num.xu,this.shi*num.xu+this.xu*num.shi);
        }
        public String string()
        {
            if(shi==0)
            {
                if(xu!=1)
                {
                    String s = xu + "i";
                    return s;
                }
                else
                    return "i";
            }
            else
            {
                if(xu!=1)
                {
                    String s = shi+"+"+xu+"i";
                    return s;
                }
                else
                {
                    String s = shi+"+"+"i";
                    return s;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;//第二个复数的实部和虚部
        int c,d;//第一个复数的实部和虚部
        System.out.println("请输入第一个复数的实部和虚部：");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("请输入第二个复数的实部和虚部：");
        c=in.nextInt();
        d=in.nextInt();
        Plural num1 = new Plural(a,b);
        Plural num2 = new Plural(c,d);
        //相加
        Plural plus = num1.add(num2);
        System.out.println("相加的结果为：");
        System.out.println(plus.string());
        //相减
        Plural subtract = num1.reduce(num2);
        System.out.println("相减的结果为：");
        System.out.println(subtract.string());
        //相乘
        Plural ride = num1.multiply(num2);
        System.out.println("相乘的结果为：");
        System.out.println(ride.string());
    }
}
