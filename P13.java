import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N=input.nextInt();
		double a=0;
		for(int i=1;i<=N;i++) {
			if(i%2==1) {
				a++;
			}
		}
		System.out.println((a/N));
	}

}
