import java.util.Scanner;

public class Ordinary2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cases_numbers = input.nextInt();
		int temp = 0;
		int count = 0;
		for(int i=0;i<cases_numbers;i++) {
			int number = input.nextInt();
			int n = (int)Math.log10(number) + 1 ;
			for(int j=1;j<=n;j++) {
				temp = temp * 10 +1;
				for(int k=1;k<=9;k++) {
					if((k*temp>=1) & (k*temp <=number)) {
						count++;}
				}//for
							
			}//for every single number or test case
			
			System.out.println(count);
			count = 0;
		}//for all test_cases

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
