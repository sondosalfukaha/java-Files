import java.util.*;


public class Map11 {

	public static void main(String[] args) {
		 int[] chars = { 1000 };
		 ArrayList<Integer> freq = new ArrayList<>();
	 
	        for (int s: chars)
	        {
	            int prev = 0;
	 
	            if (freq.get(s) != null) {
	                prev = freq.get(s);
	            }
	 
	            freq.add(s, prev + 1);
	        }
	        
	       
	        System.out.println(freq);
	       

	}

}
