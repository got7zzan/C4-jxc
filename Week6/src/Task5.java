//5把sno为s001的记录修改为('s001','老大',20,'通信学院')
import java.sql.*;
public class Task5{
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///test?characterEncoding=utf-8", "root", "family520");
            //3.定义sql
            String sql = "update student set College = '通信学院' where SNO='s001'";
            //4.获取Connection对象
            stmt = conn.createStatement();
            //5.执行sql
            int count = stmt.executeUpdate(sql);
            //6.处理结果
            System.out.println(count);
            if(count>0)
            {
                System.out.println("修改成功");
            }
            else
            {
                System.out.println("修改失败");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
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
        }
    }
}

