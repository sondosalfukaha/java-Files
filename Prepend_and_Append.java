import java.util.Scanner;

public class Prepend_and_Append {

	public static void main(String[] args) {
		//Prepend and Append
		Scanner input = new Scanner(System.in);
		
		int test_cases = input.nextInt();
		
		int arr[] = new int[test_cases];
		
		for(int i=0;i<test_cases;i++) {
			int length = input.nextInt();
			String s = input.next();
			int p=0;
			//loop for s
			block:{for(int j=0;j<length;j++) {
				int left = j;//0 1 2 length
				int right = length-1-j;//len-1-0/1/2/
				if(left>right) {break block;}
				if(s.charAt(left) != s.charAt(right)) {
					p+=2;
				}
				if((s.charAt(left) == s.charAt(right))) {
					arr[i]=(length-p);
					break;
				}
				arr[i]=(length-p);
				/*System.out.println((length-p));*/
				 

				
			}//j loop
			}
		}//i loop
		for(int i=0;i<test_cases;i++) {
			System.out.println(arr[i]);
		}
























	}}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				