// 4 july 2022 
//09:35 PM
import java.util.ArrayList;
import java.util.Arrays;

public class P1 {
	//Write a Java program to shuffle elements in a array list
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList(Arrays.asList("A","B","C"));
		
		
		int min=0;
		int max=array.size()-1;
		int n=array.size();
		int num=-1;
		
		
		for(int i=0;i<n;i++) {
			//to generate random index number
			int random=(int)((Math.random()*((max - min)+1))+min);
			//swap between the current index (i) and random index (random)
			String temp=array.get(i);
			array.set(i,array.get(random));
			array.set(random, temp);
			
					
			}
		System.out.print(array);
			}//main

}//class
