import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int [] arr = new int [3];
		arr[0]= A+B;
		arr[1]= A-B;
		arr[2]= A*B;
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
