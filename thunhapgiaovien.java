//Trường phổ thông XYZ tính lương giáo viên theo quy tắc sau:
//
//Mỗi giáo viên có mã ngạch gồm 4 ký tự trong đó
//2 ký tự đầu là chức vụ (HT: Giáo viên kiêm nhiệm Hiệu trưởng, HP: Giáo viên kiêm nhiệm Hiệu phó, GV: Giáo viên thường)
//2 ký tự số cuối cùng cho biết hệ số bậc lương (không quá 20)
//Lương cơ bản của mỗi giáo viên cũng có thể khác nhau
//Phụ cấp quy định như sau
//HT: 2.000.000
//HP: 900.000
//GV: 500.000
//Thu nhập được tính bằng lương cơ bản nhân với hệ số bậc lương và cộng thêm phụ cấp.
//Hãy tính lương cho 1 giáo viên theo quy tắc trên.
import java.util.Scanner;
import java.util.*;



public class TinhThuNhapGiaoVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maNgach = sc.nextLine();
        String name = sc.nextLine();
        Long luongCoBan = Long.parseLong(sc.nextLine());
        String chucVu = String.valueOf(maNgach.charAt(0)) + String.valueOf(maNgach.charAt(1));
        long heSo = (maNgach.charAt(2) - '0') * 10 + maNgach.charAt(3) - '0';
        long phuCap = 0;
        if (chucVu.equals("HT")) {
            phuCap = 2000000;
        } else if (chucVu.equals("HP")) {
            phuCap = 900000;
        } else {
            phuCap = 500000;
        }
        System.out.format("%s %s %d %d %d\n", maNgach, name, heSo, phuCap, heSo * luongCoBan + phuCap);
    }


}









