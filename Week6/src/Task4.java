//4.查询sno为s003的记录
import java.sql.*;
public class Task4 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try{
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///test","root","family520");
            //3.定义sql
            String sql = "select * from student where SNO='s003'";
            //4.获取Connection对象
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String sno = rs.getString(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                String college = rs.getString(4);
                System.out.println(sno + "," + name + "," + age + "," + college);
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
            if(rs!=null)
            {
                try{
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}