
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll=new DoublyLinkedList();
		// dll.create(1);
		dll.insert(23,1);
		dll.insert(24, 2);
		//System.out.println(dll.head.value);
		dll.traverse();
		//dll.reversetraverse();
		//dll.search(23);
		dll.delete(0);
		dll.traverse();
		dll.deleteAll();
		dll.traverse();
		
		

	}

}
