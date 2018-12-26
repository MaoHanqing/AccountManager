import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DB {
	  //数据库连接地址
	 private final static String URL = "jdbc:mysql://localhost:3306/Account?useUnicode=true&characterEncoding=utf8";
	     //用户名
	 public final static String USERNAME = "root";
	    //密码
	 public final static String PASSWORD = "1234";
	    //加载的驱动程序类（这个类就在我们导入的jar包中）
    public final static String DRIVER = "com.mysql.jdbc.Driver";
	public static Connection getConn() {
		try {
			Class.forName(DRIVER);
			Connection connection =   DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
