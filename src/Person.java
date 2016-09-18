
public class Person
{
	private int id;
	private String fname;
	private String lName;
	private int age;

	public Person(int id, String fname, String lName, int age)
	{
		super();
		this.id = id;
		this.fname = fname;
		this.lName = lName;
		this.age = age;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getlName()
	{
		return lName;
	}

	public void setlName(String lName)
	{
		this.lName = lName;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Person [id=" + id + ", fname=" + fname + ", lName=" + lName + ", age=" + age + "]";
	}
	
	
}
