import java.util.Scanner;

public class Bitpluss {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		int nums = input.nextInt();
		int X=0;
		String equation;
		for(int i=0;i<nums;i++) {
			equation=input.next();//length = 3
			if(equation.charAt(1)=='+') {
				X=X+1;
			}
			  else if(equation.charAt(1)=='-') {
				X=X-1;
			  }
			


			
			
		}//for
		System.out.println(X);
	}

}
