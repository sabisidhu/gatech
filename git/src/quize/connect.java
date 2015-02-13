package quize;
import java.sql.*;

import javax.swing.JOptionPane;
public class connect {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 static final String DB_URL = "jdbc:mysql://localhost/gatech";
	 static final String USER = "root";
	 static final String PASS = "root";
	
	public static Connection dbConnecter(){
	try
	{
		Connection con;
		Class.forName(JDBC_DRIVER);
		con = DriverManager.getConnection(DB_URL,USER,PASS);
		System.out.println("db connected");
		//JOptionPane.showMessageDialog(null, "Database Connected");
		return con;
	}catch(Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
		return null;
	}
	
	}

}
