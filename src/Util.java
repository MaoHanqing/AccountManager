import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Util {
	 public static void insert(User user){
	        try {
	            //1、加载数据库驱动程序
	            
	            //2、获取数据库连接
	            Connection connection  = DB.getConn();
	            
	            //3、构造SQL语句（插入具体的数据）
	            String sql = "insert into person(name,age,description)values('生命壹号',22,'学到哪里，我的博客就写到哪里')";
	            
	            //4、构造一个Statement实例(用来发送SQL语句的载体)
	            Statement state = connection.createStatement();
	            
	            //5、执行SQL语句（其实是向数据库中发送sql语句）
	            state.executeUpdate(sql);
	            
	            //6、关闭连接(释放资源)
	            state.close();
	            connection.close();
	            
	            System.out.println("insert success");
	            
	           
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }  
	    }
}
