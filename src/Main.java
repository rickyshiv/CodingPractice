
public class Main {

	public static void main(String[] args) {
		CircularDoubly cdll=new CircularDoubly();
		cdll.create(4);
		// System.out.println(cdll.head.value);
		cdll.insertNode(10, 1);
		cdll.traverseCDLL();
		cdll.reverseTraversalCDLL();
		cdll.searchNode(10);
		cdll.deleteNode(1);
		cdll.traverseCDLL();
		 //System.out.println(cdll.head.next.value);
		cdll.deleteCDLL();
		cdll.traverseCDLL();
	

	}

}
