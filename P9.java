import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		int [][] arr=new int [2][2];
		Scanner input =new Scanner(System.in);
		int a=arr[0][0]=input.nextInt();
		int b=arr[0][1]=input.nextInt();
		int c=arr[1][0]=input.nextInt();
		int d=arr[1][1]=input.nextInt();
		
		System.out.println(a*d-b*c);
		
	}

}
