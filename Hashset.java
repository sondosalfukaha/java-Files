import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet <String> a = new HashSet<String>();
		a.add("sondos");
		a.add("sondos");
		a.add("SOSO");
		
		//System.out.println(a);
		for(String i:a) {
			System.out.println(i);
		}
	}

}
