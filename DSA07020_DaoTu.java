package module1;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nhokt
 */
public class DSA07020_DaoTu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            daotu(s);
        }
    }

    private static void daotu(String s) {
        Stack<Character> st = new Stack<>();
        Scanner in = new Scanner(s);
        while (in.hasNext()) {
            String tmp = in.next();
            for (int i = 0; i < tmp.length(); i++) {
                if (tmp.charAt(i) != ' ') {
                    st.push(tmp.charAt(i));
                } else {
                    while (!st.empty()) {
                        System.out.print(st.peek());
                        st.pop();
                    }
                }
            }
            while (!st.empty()) {
                System.out.print(st.peek());
                st.pop();
            }
            System.out.print(" ");

        }
        System.out.println();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
// */
//package bt.java;
//import java.util.Scanner;
///**
// *
// * @author Admin
// */
////public class DaoTu {
////    private static Scanner sc = new Scanner(System.in);
////    public static void main(String args[]) {
////        int t;
////        t = sc.nextInt();
////        int n = t+1;
////        while(n-->0){
////            String str;
//            str = sc.nextLine();
//            String[] words = str.split(" ");
//            String reversedString = "";
//            for (int i = 0; i < words.length; i++)
//            {
//                String word = words[i];
//                String reverseWord = "";
//                for (int j = word.length()-1; j >= 0; j--)
//                {
//                    reverseWord = reverseWord + word.charAt(j);
//                }
//                reversedString = reversedString + reverseWord + " ";
//            }
//
//            System.out.println(reversedString);
//        }
//    }
//    
//}
