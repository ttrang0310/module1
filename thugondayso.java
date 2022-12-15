/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoBan;

import java.util.*;

//Cho dãy số A[] chỉ bao gồm các số nguyên dương. Người ta thu gọn dần dãy số bằng cách loại bỏ các cặp phần tử kề nhau mà có tổng là chẵn. Sau khi cặp phần tử đó bị loại ra thì dãy số được dồn lại. Cứ tiếp tục như vậy cho đến khi không còn cặp phần tử nào kề nhau có tổng chẵn nữa.
//
//Hãy tính xem cuối cùng dãy A[] còn bao nhiêu phần tử.
public class J02017_ThuGonDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        int i = 0;
        int length = a.size();
        while (i < length - 1) {
            if ((a.get(i) + a.get(i + 1)) % 2 == 0) {
                a.remove(i);
                a.remove(i);
                length = a.size();
                i = 0;
            } else {
                i++;
            }

        }

        System.out.println(a.size());
    }
}
