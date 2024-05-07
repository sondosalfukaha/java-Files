
public class Stack {
	private int []array1;
	private int size;
	private int top;
	Stack(int a){
		this.size=a;
		array1=new int[size];
		top=-1;		
	}
	public void push(int element) {
		array1[++top]=element;
	}
	public int pop() {
		return array1[top--];
	}
	public int peek() {
		return array1[top];
	}
	public boolean isEmpty() {
		return(top==-1);
	}
	public boolean isFul() {
		return(top==(size-1));
	}
	public void display() {
		while(!this.isEmpty()) {
			int item= this.pop();
			System.out.print(item + " ");
		}
	}
}
