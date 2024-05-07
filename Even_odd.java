	import java.util.Scanner;
	
	public class Even_odd {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			 long n = input.nextLong();// required position 5
			 long k = input.nextLong();//array size 6
			
			long odds = (n+1)/2;//3
			if(k>odds) {//6>3
				System.out.println(2*(k-odds));//2*3=6
			}
			else {
				System.out.println(2*k-1);//the required index is less thab odds rang 
										// to determine index reange by size/2 or (size+1)/2
			}
			
			
			
		}
	
	}
