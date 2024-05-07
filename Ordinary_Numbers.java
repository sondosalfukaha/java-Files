import java.util.Scanner;

public class Ordinary_Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*int t = input.nextInt();//test cases*/
		int n,n2;
		/*int arr[]=new int[5];*/
	
		int temp=0;
		int count=0;
		for(int i=0;i<5;i++) {
			n = input.nextInt();
			/*for each test case*/
			n2=(int)Math.log10(n)+1;
			for(int j=1;j<=n2;j++) {
				temp = temp*10 + 1;
				for(int b=1;b<=9;b++) {
					if((temp*b)>=1 & (temp*b)<=n) {
						count++;
					}//if 
					
				}
			}
		}//first for
		System.out.println();
		/*for(int i=0;i<t;i++) {
			System.out.println(arr[i]);
		}*/
		}

}
