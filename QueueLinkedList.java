
public class QueueLinkedList {
	class Node {
		int data;
		Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
	}
	
	Node rear,front;
	QueueLinkedList(){
		rear=null;
		front=null;
	}
	boolean isEmpty() {
		return rear==null;/*or return front==nul > because when front or rear both
		of them equal null that is mean the queue is empty!!*/
	}
	void enqueu(int item) {
		Node n = new Node(item);
		if(this.isEmpty()) {
			this.front=this.rear=n;
			return;
		}
		rear.next=n;
		rear=n;
		}
	void deQueu() {
		if(!this.isEmpty()) {
			 
			front=front.next;
		}
	}
	void deleteall() {
		rear=front=null;
	}
	void dispaly() {
		Node n=front;
		while(n!=null) {
			System.out.print(" "+n.data);
			n=n.next;
		}
	}
}
