//2.查看表中的所有信息，遍历输出到控制台
import java.sql.*;

public class Task2 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try{
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///test?characterEncoding=utf-8","root","family520");
            //3.定义sql
            String sql = "select * from student";
            //4.获取Connection对象
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                String sno = rs.getString("SNO");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                String college = rs.getString("College");
                System.out.println(sno+","+name+","+age+","+college);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            //7.释放资源
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}