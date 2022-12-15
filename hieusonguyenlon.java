/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module1;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author nhokt
 */
public class J03015_HieuSoNguyenLon2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        BigInteger a = new BigInteger(input1);
        BigInteger b = new BigInteger(input2);
        BigInteger kq = a.subtract(b);
        System.out.println(kq);

    }
}
//Cho hai xâu ký tự A và B mô tả hai số nguyên dương lớn có thể có đến 1000 chữ số.
//
//Có thể có các chữ số 0 ở đầu của A và B.
//Hãy tính A - B.
//
//Kết quả có thể âm, khi ghi ra cần loại bỏ các chữ số 0 ở đầu nếu có.
//
//Tất nhiên nếu kết quả là -0 thì ghi ra là 0.