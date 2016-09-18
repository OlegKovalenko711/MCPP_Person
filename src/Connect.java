import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;

public class Connect
{
	public Statement st;
	public ResultSet rs;
	public Connection con;

	public void connectToDB() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.h2.Driver");
		con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		st = con.createStatement();
	}
}
