/*
 * Name: Jose Terrones Jr.
 * Purpose: Basic properties for the person object that the caller will use.
 */

package arrayL_obj;

public class person {
	String name1;
	int id1;
	person()
	{
	}
	//constructor taking in two parameters
	person(String name, int id)
	{
		name1 = name;
		id1 = id;
	}
	public void setId(int id)
	{
		id1 = id;
	}
	public void setName(String name)
	{
		name1 = name; 
	}
	public int getId()
	{
		return id1;
	}
	public String getName()
	{
		return name1;
	}
	public void display()
	{
		System.out.println(getName() + ", ID: " + getId());
	}
}
