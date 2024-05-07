import java.util.Scanner;

public class nn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int c = 0;
		int cc = 0;
		while(number % 10!=0) {
			number = number + 1;
			c++;
		}
		number = number-c;
		while(number % 10!=0) {
			number = number - 1;
			cc++;
		}
		if(cc>c) {
			System.out.println(c);
		}
		else System.out.println(cc);
		
	}

}
