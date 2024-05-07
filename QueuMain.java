
public class QueuMain {

	public static void main(String[] args) {
		QueueLinkedList n = new QueueLinkedList();
		n.enqueu(3);
		n.enqueu(2);
		n.enqueu(1);
		n.deleteall();
		n.enqueu(3);
		
		n.dispaly();

	}

}
