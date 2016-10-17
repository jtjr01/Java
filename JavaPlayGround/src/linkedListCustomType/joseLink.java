/*
 * Name: Jose Terrones Jr.
 * Purpose: Handles the custom type created for the list.
 * It is given basic attributes like name, id and what is the nextLink.
 */

package linkedListCustomType;

public class joseLink {
	
	private String name;
	private int id;
	private joseLink nextLink;
	
	joseLink()
	{
	}
	//constructor that takes in name and id.
	joseLink(String name1, int id1)
	{
		name = name1;
		id = id1;
	}
	public void setName(String name1)
	{
		name = name1;
	}
	public void setId(int id1)
	{
		id = id1;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public void setNextLink(String name1, int id1)
	{
		nextLink = new joseLink(name1,id1);
	}
	public joseLink getNextLink()
	{
		return nextLink;
	}

}
