package module1;
//Viết chương trình khai báo lớp Thí Sinh gồm các thông tin: Họ tên, Ngày sinh, Điểm môn 1, Điểm môn 2, Điểm môn 3 và Tổng điểm.
//
//Đọc thông tin 1 thí sinh từ bàn phím và in ra màn hình 3 thông tin: Họ tên, Ngày sinh, Tổng điểm
package bt.java;

import java.text.ParseException;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhaiBaoLopThiSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        while(true){
            ThiSinh thiSinh=new ThiSinh(in.nextLine(),in.nextLine(), Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()));
            System.out.println(thiSinh.toString());
            break;
        }
    }

    
}


class ThiSinh {
    private String hoTen;
    private Date ngaySinh;
    private Float diem1;
    private Float diem2;
    private Float diem3;

    public ThiSinh(String hoTen, String ngaySinh, Float diem1, Float diem2, Float diem3) throws ParseException{
        this.hoTen = hoTen;
        this.ngaySinh =new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public ThiSinh(){
        
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Float getDiem1() {
        return diem1;
    }

    public void setDiem1(Float diem1) {
        this.diem1 = diem1;
    }

    public Float getDiem2() {
        return diem2;
    }

    public void setDiem2(Float diem2) {
        this.diem2 = diem2;
    }

    public Float getDiem3() {
        return diem3;
    }

    public void setDiem3(Float diem3) {
        this.diem3 = diem3;
    }
    public Float tinhTongDiem(){
        return (diem1+diem2+diem3);
    }
    @Override
    public String toString(){
        return hoTen+" "+ new SimpleDateFormat("dd/MM/yyy").format(ngaySinh)+" "+tinhTongDiem();
    }
    
}

