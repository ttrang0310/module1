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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DocFileVanBan {
    public static void main(String args[]) throws FileNotFoundException {

        String url = "DATA.in";

        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);

        try {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } finally {
            try {
                sc.close();
                fileInputStream.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}