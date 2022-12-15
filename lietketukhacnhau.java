Cho file văn bản VANBAN.in.

Một từ được định nghĩa là một dãy ký tự liên tiếp không có khoảng trống, dấu tab hay dấu xuống dòng. Tạm thời chưa xét đến các dấu câu trong bải toán này.

Hãy chuyển tất cả các từ về dạng chữ thường sau đó liệt kê các từ khác nhau xuất hiện trong file VANBAN.in theo thứ tự từ điển.
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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

public class LietKeTuKhacNhau {
    public static void main(String args[]) throws FileNotFoundException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("VANBAN.in"))) {
            String line = bufferedReader.readLine();
            TreeSet<String> treeSet = new TreeSet<>();
            while (line != null) {
                String[] word = line.split(" ");
                for (int i =0;i< word.length;i++){
                    treeSet.add(word[i].toLowerCase());
                }
                line = bufferedReader.readLine();
            }

            for (String item : treeSet){
                System.out.println(item);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


