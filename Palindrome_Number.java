import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x = input.nextInt();
		String s = Integer.toString(x);
		char arr[]=s.toCharArray();
		char arr2[]=new char[arr.length];
		for (int i=0;i<arr.length;i++) {
			arr2[i]=arr[arr.length-1-i];
		}
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr2[i]) {
				flag=false;
			}
		}
		System.out.println(flag);
		
	}

}
