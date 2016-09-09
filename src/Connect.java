import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Connect
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		ArrayList<Person> pp = new ArrayList<>();

		Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		java.sql.Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Person");

		while (rs.next())
		{
			pp.add(new Person(rs.getInt("id"), rs.getString("fName"), rs.getString("lName"), rs.getInt("age")));
		}

		for (Person p : pp)
		{
			System.out.println(p.toString());
		}
		
		con.close();
	}
}
