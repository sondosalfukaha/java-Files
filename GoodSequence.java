import java.util.BitSet;
import java.util.Scanner;


public class GoodSequence {

	public static void main(String[] args) {
		
		
	Scanner input=new Scanner(System.in);
	System.out.println("Enter size : ");
	
	int n = input.nextInt();
	
	int[] arr=new int[10000000];//1
	int[] frq=new int[1000000000];//1
	for(int i=0;i<n;i++) {// 0 > 1 
		System.out.println("Enter element : ");
		arr[i]=input.nextInt();// 10000
		frq[arr[i]]++;//frq[arr[0]]++
	}
	int count=0;
	for(int i=0;i<frq.length;i++) {
		if(frq[i]>i) {
			count+=frq[i]-i;
		}
		if(frq[i]<i) {
			count+=frq[i];
		}
	}
	System.out.println(count);
	

	}

}
