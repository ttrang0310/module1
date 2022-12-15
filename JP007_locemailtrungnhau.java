package module1;

import java.util.Scanner;
import java.util.TreeSet;

public class JP007_locemailtrungnhau {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		TreeSet<String> email = new TreeSet<>();
		while(in.hasNextLine()) {
			email.add(in.nextLine().toLowerCase());
			
		}
		for(String x:email) {
			System.out.println(x);
		}
	}
}
