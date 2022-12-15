Bài toán quản lý danh sách mặt hàng trong đó mỗi mặt hàng sẽ có các thông tin:

Mã mặt hàng: tự động tăng, tính từ MH001
Tên mặt hàng: xâu ký tự độ dài không quá 100
Đơn vị tính: xâu ký tự độ dài không quá 10
Giá mua: số nguyên dương không quá 7 chữ số
Giá bán: số nguyên dương không quá 7 chữ số
Viết chương trình nhập danh sách mặt hàng, sắp xếp theo lợi nhuận (giá bán trừ đi giá mua) giảm dần. Nếu lợi nhuận bằng nhau thì in ra theo thứ tự mã tăng dần. 

Input

Dòng đầu ghi số M là số mặt hàng (không quá 40).

Tiếp theo là thông tin của M mặt hàng, mỗi mặt hàng ghi trên 4 dòng theo đúng thứ tự đã mô tả (không có mã)

Output

Ghi ra danh sách mặt hàng có đầy đủ thông tin ở trên và lợi nhuận tính được (mỗi thông tin cách nhau một khoảng trống)
package bt.java;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachMatHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MatHang> list = new ArrayList<>();
        int m;
        m = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1;i<=m;i++){
            String maMH = "MH" + String.format("%03d", i);
            String tenMH = scanner.nextLine();
            String donViTinh = scanner.nextLine();
            String giaMua = scanner.nextLine();
            String giaBan = scanner.nextLine();

            MatHang matHang = new MatHang(maMH, tenMH, donViTinh, Integer.parseInt(giaMua), Integer.parseInt(giaBan));
            list.add(matHang);
        }
        list.sort(new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return o1.compareTo(o2);
            }
        });

        for (MatHang matHang: list) {
            System.out.println(matHang);
        }

    }
}

 class MatHang{
    private String maMH;
    private String tenMH;
    private String donViTinh;

    private int loiNhuan;
    private int giaMua;
    private int giaBan;

    public MatHang(String maMH, String tenMH, String donViTinh, int giaMua, int giaBan) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }
    public int compareTo(MatHang matHang) {
        return -(this.loiNhuan - matHang.loiNhuan);
    }


    @Override
    public String toString(){
        return maMH + " " + tenMH + " " + donViTinh + " " +giaMua + " " + giaBan + " " + loiNhuan + " ";
    }
}
