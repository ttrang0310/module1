//Một nhân viên làm việc trong công ty được lưu lại các thông tin sau:
//
//Mã nhân viên: được gán giá trị là 00001
//Họ tên: Xâu ký tự không quá 40 chữ cái.
//Giới tính: Nam hoặc Nu
//Ngày sinh: đúng theo chuẩn dd/mm/yyyy
//Địa chỉ: Xâu ký tự không quá 100 chữ cái
//Mã số thuế: Dãy số có đúng 10 chữ số
//Ngày ký hợp đồng: đúng theo chuẩn dd/mm/yyyy
//Viết chương trình nhập một nhân viên (không nhập mã) in ra màn hình thông tin của nhân viên đó.

import java.text.ParseException;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        NhanVien nhanVien=new NhanVien("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                sc.nextLine(), sc.nextLine());
        System.out.println(nhanVien);
    }
}





class NhanVien {

    private String maNhanVien,ten,gioiTinh,ngaySinh,diaChi,maSoThue,ngayKiHopDong;

    public NhanVien(String maNhanVien, String ten, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKiHopDong) {
        this.maNhanVien = maNhanVien;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKiHopDong = ngayKiHopDong;
    }
    public String toString(){
        return String.format("%s %s %s %s %s %s %s",maNhanVien,ten,gioiTinh,ngaySinh,diaChi,maSoThue,ngayKiHopDong);
    }
}

