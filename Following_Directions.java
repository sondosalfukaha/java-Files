import java.util.ArrayList;
import java.util.Scanner;
 
public class Following_Directions {
 
	public static void main(String[] args) {
		//Following Directions
 		Scanner input = new Scanner(System.in);
		int test_cases = input.nextInt();
		
		for(int i=0;i<test_cases;i++) {
			boolean flag = false;
			int length_of_string = input.nextInt();
			String direction = input.next();
			int up= 0;
			int right = 0;
			for(int j=0;j<length_of_string;j++) {
				if(direction.charAt(j) == 'U') {
					up++;
					
				}
				else if(direction.charAt(j) == 'D') {
					up--;
				}
				else if(direction.charAt(j) == 'R') {
					right++;
				}
				else if(direction.charAt(j) == 'L') {
					right--;
				}
    		    if(up==1 && right==1) {
    		    	flag = true;
                    break;
				}//if 1>1
    		    
    		    
    		    
    		    
    		    
		}//the nested loop

			if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
				
			}//The main loop
		
	
 
	}
 
}