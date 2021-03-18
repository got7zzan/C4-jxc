/*
1.插入如下数据
('s001','老大',20,'计算机学院')
('s002','老二',19,'计算机学院')
('s003','老三',18,'计算机学院')
('s004','老四',17,'计算机学院')
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Task1 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        try{
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///test?characterEncoding=utf-8","root","family520");
            //3.定义sql
            String sql1 = "insert into student values('s001','老大',20,'计算机学院')";
            String sql2 = "insert into student values('s002','老二',19,'计算机学院')";
            String sql3 = "insert into student values('s003','老三',18,'计算机学院')";
            String sql4 = "insert into student values('s004','老四',17,'计算机学院')";
            //4.获取Connection对象
            stmt = conn.createStatement();
            //5.执行sql
            int count1 = stmt.executeUpdate(sql1);
            int count2 = stmt.executeUpdate(sql2);
            int count3 = stmt.executeUpdate(sql3);
            int count4 = stmt.executeUpdate(sql4);
            //6.处理结果
            System.out.println(count1);
            System.out.println(count2);
            System.out.println(count3);
            System.out.println(count4);
            if(count1>0 && count2>0 && count3>0 && count4>0)
            {
                System.out.println("添加成功");
            }
            else
            {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            //7.释放资源
            if(stmt!=null)
            {
                try{
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn!=null)
            {
                try{
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}