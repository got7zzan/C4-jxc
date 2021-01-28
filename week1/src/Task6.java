import java.util.Scanner;

public class Task6 {
    public static class Account{
        String name;
        float balance;

        //开户
        public Account(String name, float balance)
        {
            this.name=name;
            this.balance=balance;
        }

        //查询余额
        public float getBalance()
        {
            return balance;
        }

        //查询名称
        public String getName()
        {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        float balance;

        System.out.println("请输入用户名：");
        name=in.nextLine();
        System.out.println("请输入你想存入的金额：");
        balance=in.nextFloat();

        //开户
        Account account = new Account(name,balance);
        //查询相关信息
        System.out.println("账户名称为："+account.getName());
        System.out.println("账户余额为："+account.getBalance());
    }
}
