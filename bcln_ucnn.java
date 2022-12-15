/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.java;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class BSChungUSChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            long a, b;
            a = sc.nextLong();
            b = sc.nextLong();
            long gcd = gcd(a, b);
            long lcm = (a*b)/ gcd;
            System.out.println(lcm + " " + gcd);
            t--;
        }
    }

    public static long gcd(long a, long b) {
        if(b == 0)  return  a;
        else return gcd(b, a%b);
    }
}