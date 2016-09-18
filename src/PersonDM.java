import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class PersonDM extends AbstractTableModel
{

	ArrayList<Person> person;

	public PersonDM(ArrayList<Person> person)
	{
		this.person = person;
	}

	@Override
	public int getColumnCount()
	{
		return 4;
	}

	@Override
	public int getRowCount()
	{
		return person.size();
	}

	@Override
	public String getColumnName(int c)
	{
		String result = "";
		switch (c)
		{
		case 0:
			result = "id";
			break;
		case 1:
			result = "fName";
			break;
		case 2:
			result = "lName";
			break;
		case 3:
			result = "age";
			break;
		}
		return result;
	}

	@Override
	public Object getValueAt(int row, int col)
	{
		switch (col)
		{
		case 0:
			return person.get(row).getId();
		case 1:
			return person.get(row).getFname();
		case 2:
			return person.get(row).getlName();
		case 3:
			return person.get(row).getAge();
		default:
			return "";
		}

	}

}
