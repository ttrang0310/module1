package module1;
//Cho một xâu ký tự S chỉ có các chữ cái Tiếng Anh viết thường. Hãy đếm xem có bao nhiêu ký tự chữ cái khác nhau trong S.
 
import java.util.*;
public class J03038_DanhDauChuCai {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long t= in.next().chars().distinct().count();
        System.out.println(t);
    }
}
