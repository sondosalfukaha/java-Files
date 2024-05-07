import java.util.*;

public class a {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList();
		Scanner h = new Scanner(System.in);
		System.out.println("Enter size of: ");
		int num = h.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Enter");
			a.add(h.nextInt());
		}
		 for (int s: a){
				 int prev = 0;
	 
	            if (a.get(s)!=null) {
	                prev = a.get(s);
	            }
	 
	            a.add(s, prev + 1);
	        }
	 
	        System.out.println(a);
	}
	

}
