
public class StackLinkedList {
	class Node {
		int item;
		Node next;
	}
	Node top;
	StackLinkedList(){
		top=null;
	}
	void push(int element) {
		Node newone = new Node();
		newone.item=element;
		newone.next=top;
		this.top=newone;
	}
	boolean isEmpty() {
		return(top==null);
	}
	void pop() {
		if(top==null) {
			System.out.println("NO more item to display");
		}
		else {
			/*Node curr_item = new Node();*/
			 top=top.next;			
		}
	}
	  int peek() {
		return top.item;
	}
	void dispaly() {
		Node curr = top;
		while(curr != null) {
 			 System.out.print(curr.item+" ");
			 curr=curr.next;
		}
	}
	
}
