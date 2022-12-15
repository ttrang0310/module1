package module1;

import java.util.Scanner;
import java.util.TreeSet;

public class J02006_hopcuahaigiaiso {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TreeSet<Integer> a = new TreeSet<>();
		TreeSet<Integer> b = new TreeSet<>();
		int n = in.nextInt();
		int m = in.nextInt();
		for(int i=0;i<n;i++)
			a.add(in.nextInt());
		for(int i=0;i<m;i++)
			b.add(in.nextInt());
		a.addAll(b);
		for(Integer x:a) {
			System.out.print(x+ " ");
		}
	}
}
