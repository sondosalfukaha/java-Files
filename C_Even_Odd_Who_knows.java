import java.util.Scanner;

public class C_Even_Odd_Who_knows {

	public static void main(String[] args) {		
				Scanner input = new Scanner(System.in);
				int a = input.nextInt();
				int b = input.nextInt();
				int c = a + b;
				if((a>=1 & a<=100) & (b>=1 & b<=100)) {
				if(a==b | c%2!=0) {
					System.out.println("Rematch");
				}
				else if(c%2==0) {
					if(a>b) {
						System.out.println("First won");
					}
					else if(b>a) {
						System.out.println("Second won");

						
				}


		}  
				
		}
	}

}
