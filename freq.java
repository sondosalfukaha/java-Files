import java.util.Scanner;

public class freq {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		int [] arr = new int[n];
		
        int [] fr = new int [arr.length];  
        int visited=-1;
 		int c=0;
 		for(int i=0;i<arr.length;i++) {
 			arr[i]=input.nextInt();
 		}
		int count=0;
 		for(int i=0;i<arr.length;i++) {
 			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fr[j]=visited;
				}
				
			}
		     if(fr[i] != visited)  
	                fr[i] = count;  
	        }  
 		int o=0;
	  
 		 for(int i = 0; i < fr.length; i++){  
             if(fr[i] != visited) {
            	
                 System.out.println("    " + arr[i] + "    |    " + fr[i]);
                 if(fr[i]>arr[i]) {
                
                	 o+=fr[i]-arr[i];
                 }
                 if(fr[i]<arr[i]) {
                
                	 o+=fr[i];
                 }
         }  
 		 }
 		 System.out.println(o);
 		
 		 
 		
 			
 		
 		}

}



