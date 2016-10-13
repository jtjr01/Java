/*
 * Name: Jose Terrones Jr.
 * Purpose: node.java class will create a new node when it is used.
 * It will compare the data of new entry with what is already
 * in the tree and will place it left or right.
 */
package binaryTree;

public class node {
	public Integer data;
	public node leftLink;
	public node rightLink;

	//addNode makes new nodes that can all work recursively
	public void addNode(node newNode)
	{
		int compare = newNode.data.compareTo(data);
		if(compare < 0)
		{
			if(leftLink == null)
			{
				leftLink = newNode;
			}
			else
			{
				leftLink.addNode(newNode);
			}
		}
		else if(compare > 0)
		{
			if(rightLink == null)
			{
				rightLink = newNode;
			}
			else
			{
				rightLink.addNode(newNode);
			}
		}
	}
}
