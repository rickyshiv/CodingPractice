
public class Circular {
	public Node head;
	public Node tail;
	public int size;
	public Node creation(int nodeValue)
	{
		Node node=new Node();
		head=new Node();
		node.value=nodeValue;
		node.next=node;
		head=node;
		tail=node;
		size=1;
		return head;
		
	}
	public void insert(int nodeValue,int location)
	{
		Node node =new Node();
		node.value=nodeValue;
		if(head==null)
		{
			creation(nodeValue);
			return;
		}
		else if(location==0)
		{
			node.next=head;
			head=node;
			tail.next=node;
			
		}
		else if(location>=size)
		{
			tail.next=node;
			tail=node;
			tail.next=head;
		}
		else
		{
			Node tempNode=head;
			int index=0;
			while(index<location-1)
			{
				tempNode=tempNode.next;
				index ++;
				
			}
			node.next=tempNode.next;
			tempNode.next=node;
			
			
		}
		size ++;
		
	}
	public void traverse()
	{
		if(head!=null)
		{
			Node tempNode=head;
			for(int i=0;i<size;i++)
			{
				System.out.print(tempNode.value);
				if(i!=size-1)
				{
					System.out.print("->");
				}
				tempNode=tempNode.next;
			}
			
		}
		else
		{
			System.out.println("\n CL doesnt exist");
		}
	}
	public boolean search(int nodeValue)
	{
		if(head!=null)
		{
			Node tempNode=head;
			for(int i=0;i<size;i++)
			{
				if(tempNode.value==nodeValue)
				{
					System.out.println("Found node at location"+i);
					return true;
				}
				tempNode=tempNode.next;
			}
		}
		System.out.println("Node not found");
		return false;
	}
	public void delete(int location)
	{
		if(head==null)
		{
			System.out.println("CLL doesnt exist");
			return;
		}
		else if(location==0)
		{
			head=head.next;
			tail.next=head;
			size --;
			if(size==0)
			{
				head=null;
				tail=null;
				head.next=null;
			}
		}
		else if(location>=size)
		{
			Node tempNode=head;
			for(int i=0;i<size-1;i++)
			{
				tempNode=tempNode.next;
			}
		
		if(tempNode==head)
		{
			head.next=null;
			tail=head=null;
			size --;
			return ;
			
		}
		tempNode.next=head;
		tail=tempNode;
		size --;
		}
		else
		{
			Node tempNode=head;
			for(int i=0;i<location-1;i++)
			{
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			size --;
			
			
		}
		
		
	}
	public void deleteAll()
	{
		if(head==null)
		{
			System.out.println("CSLL doesnt exist");
		}
		else
		{
			tail.next=null;
			tail=null;
			head=null;
			System.out.println("CSLL has deleted");
		}
	}

}
