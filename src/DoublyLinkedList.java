
public class DoublyLinkedList {
	int size;
	Node head;
	Node tail;
	
	public Node create(int nodeValue)
	{
		head=new Node();
		Node node=new Node();
		node.value=nodeValue;
		node.next=null;
		node.prev=null;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	public void insert(int nodeValue,int location)
	{
		Node node=new Node();
		node.value=nodeValue;
		if(head==null)
		{
			create(nodeValue);
			return;
		}
		else if(location==0)
		{
			node.prev=null;
			node.next=head;
			head=node;
			head.prev=node;
		}
		else if(location>=size)
		{
			node.next=null;
			node.prev=tail;
			tail.next=node;
			tail=node;
		}
		else
		{
			Node tempNode=head;
			int index=0;
			while(index<=location-1)
			{
				tempNode=tempNode.next;
				index ++;
			}
			node.next=tempNode.next;
			node.prev=tempNode;
			tempNode.next=node;
			node.next.prev=node;
			
		
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
					System.out.print("-->");
				}
				tempNode=tempNode.next;
			}
		}
		else {
			System.out.print("Not exists");
		}
		System.out.print("\n");
	}
	public void reversetraverse()
	{
		if(head!=null)
		{
			Node tempNode=tail;
			for(int i=0;i<size;i++)
			{
				System.out.print(tempNode.value);
				if(i!=size-1)
				{
					System.out.print("<--");
				}
				tempNode=tempNode.prev;
			}
		}
		else {
			System.out.print("Not exists");
		}
		System.out.print("\n");
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
				System.out.println("Node found at location"+" "+i);
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
			System.out.println("DLL does'nt exist");
			return ;
		}
		else if(location ==0)
		{
			if(size==1)
			{
				head=null;
				tail=null;
				size --;
				return;
			}
			else
			{
				head=head.next;
				head.prev=null;
				size --;
			}
		}
		else if(location>=size)
		{
			Node tempNode=tail.prev;
			if(size==1)
			{
				head=null;
				tail=null;
				size --;
				return;
			}
			else
			{
				tempNode.next=null;
				tail=tempNode;
				size--;
			}
		}
		else
		{
			Node tempNode=head;
			for(int i=0;i<location-1;i++)
			{
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			tempNode.next.prev=tempNode;
			size --;
			
		}
	}
	public void deleteAll()
	{
		Node tempNode=head;
		for(int i=0;i<size;i++)
		{
			tempNode.prev=null;
			tempNode=tempNode.next;
		}
		head=null;
		tail=null;
		System.out.println("DLL has been deleted succesfully");
	}
}
