package module1;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011_uclncuahaisonguyenlon {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			BigInteger a = in.nextBigInteger();
			BigInteger b = in.nextBigInteger();
			System.out.println(a.gcd(b));
		}
	}
}
