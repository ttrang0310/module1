package module1;

//Input
//
//Output
//
//Nguyen Hoa Binh
//
//D20CQCN04-B
//
//2/2/2002
//
//2
//
//B20DCCN001 Nguyen Hoa Binh D20CQCN04-B 02/02/2002 2.00

//Viết chương trình khai báo lớp Sinh Viên gồm các thông tin: Mã SV, Họ tên, Lớp, Ngày sinh và Điểm GPA (dạng số thực float). Hàm khởi tạo không có tham số, gán các giá trị thuộc tính ở trạng thái mặc định (xâu ký tự rỗng, giá trị số bằng 0).
//
//Đọc thông tin 1 sinh viên từ bàn phím (không có mã sinh viên) và in ra màn hình. Trong đó Mã SV được gán là B20DCCN001. Ngày sinh được chuẩn hóa về dạng dd/mm/yyyy.
import java.text.ParseException;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class KhaiBaoLopSinhVien {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SinhVien sinhVien = new SinhVien("", sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
        System.out.println(sinhVien);
    }
}






class SinhVien {

    private String msv, tenSV, lop;
    private Date ngaySinh;
    private float gpa;

    public SinhVien(String maSv, String tenSV, String lop, String ngaySinh, Float gpa) throws ParseException {
        this.tenSV = tenSV;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("B20DCCN001 %s %s %s %.2f", tenSV.toString(), lop.toString(), new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh), gpa);
    }

}


