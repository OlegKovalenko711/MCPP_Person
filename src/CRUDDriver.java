import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

public class CRUDDriver
{
	ArrayList<Person> pp;

	public ArrayList<Person> read() throws SQLException, ClassNotFoundException
	{
		Connect connect = new Connect();
		connect.connectToDB();

		pp = new ArrayList<>();
		connect.rs = connect.st.executeQuery("select * from Person");

		ArrayList<Person> pp = new ArrayList<>();

		while (connect.rs.next())
		{
			pp.add(new Person(connect.rs.getInt("id"), connect.rs.getString("fName"), connect.rs.getString("lName"),
					connect.rs.getInt("age")));
		}

		for (Person p : pp)
		{
			System.out.println(p.toString());
		}
		connect.con.close();
		return pp;
	}

	public void create(Person p) throws ClassNotFoundException, SQLException
	{
		Connect connect = new Connect();
		connect.connectToDB();

		connect.st.execute("insert into Person(fName, lName, age) values('" + p.getFname() + "','" + p.getlName()
				+ "','" + p.getAge() + "')");
		connect.con.close();
	}

	public void delete(int id) throws ClassNotFoundException, SQLException
	{
		Connect connect = new Connect();
		connect.connectToDB();

		connect.st.execute("delete from Person where id = " + id);
		connect.con.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		CRUDDriver cd = new CRUDDriver();
		Person p = new Person(4, "rr", "uu", 789);

		cd.read();
	}
}
