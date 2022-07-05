
public class StackL {
	private class Node
	{
		public int data;
		public Node next;
	}
	Node top=null;

public void push(int val)
{
	Node temp=new Node();
	temp.data=val;
	temp.next=top;
	top=temp;
	
}
public void pop()
{
	if(top==null)
	{
		System.out.println("Stack is empty");
	}
	else
	{
		System.out.println(top.data);
		top=top.next;
	}
}
public void peek()
{

	if(top==null)
	{
		System.out.println("Stack is empty");
	}
	else
	{
		System.out.println(top.data);
		
	}
}
public void display()
{
	if(top==null)
	{
		System.out.println("Stack is empty");
	}
	else
	{
	Node temp=top;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
	}
}

}
