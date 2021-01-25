import static java.lang.Math.pow;

public class Task2 {
    public static void main(String[] args) {
        int i=0,temp=0,ge=0,shi=0,bai=0;
        System.out.println("水仙花数有：");
        for ( i = 100 ; i < 1000 ; i++)
        {
            ge = i % 10;
            shi = i % 100 / 10;
            bai = i / 100;
            if (i == pow (ge , 3) + pow (shi , 3) + pow (bai , 3))
            {
                temp++;
                System.out.println(i);
            }
        }
        System.out.println("水仙花数的个数为：" + temp);
    }
}
