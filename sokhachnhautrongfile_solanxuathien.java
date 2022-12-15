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


import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SoKhacNhauTrongFileTru1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer,Integer> m = new TreeMap<>();
        while(sc.hasNextInt()){
            int x = sc.nextInt();
            if(m.containsKey(x)){
                int d= m.get(x);
                d++;
                m.replace(x, d);
            }else{
                m.put(x, 1);
            }
        }
        m.forEach((t, u) -> {
            System.out.println(t +" "+u);
        });
    }
}
