package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionUtil {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	private static Properties props = new Properties();
	private static ThreadLocal<Connection> threadLocal;
	
	static {
		try {
			props.load(ConnectionUtil.class.getClassLoader().getResourceAsStream("jdbc.properties"));
			
			driver = props.getProperty("jdbc.driver");
			url = props.getProperty("jdbc.url");
			username = props.getProperty("jdbc.username");
			password = props.getProperty("jdbc.password");
			
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection connection = threadLocal.get();
		try {
			if (connection == null) {
				connection = DriverManager.getConnection(url, username, password);
				threadLocal.set(connection);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
