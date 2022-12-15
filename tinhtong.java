Cho file dữ liệu dạng văn bản DATA.in có thể chứa cả số và ký tự.

Hãy lọc ra các số nguyên int trong file và tính tổng các số đó.

Chú ý: file dữ liệu có rất nhiều dòng với rất nhiều số và ký tự xen kẽ nhau. Chỉ tính tổng các số thỏa mãn điều kiện là số kiểu int.

Input

File văn bản DATA.in có không quá 1000 dòng.

Output

Ghi ra giá trị tổng các số tính được.
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
import java.util.*;
import java.io.*;
public class TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        long kq = 0;
        while(in.hasNext()){
            String tmp = in.next();
            try{
                kq = kq + Integer.parseInt(tmp);
            }catch(NumberFormatException e){
                continue;
            }
        }
        System.out.println(kq);
    }
}
