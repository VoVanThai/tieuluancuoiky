import java.util.Scanner;

public class Goods {
    String LoaiHang;
    int MaHang;
    String TenHang;
    double GiaHang;
    int SoLuongTonKho;
    String NgayNhap;

    public Goods() {
    }

    public Goods(String lh, int mh, String th, double gh, int sltk, String nn){
        LoaiHang = lh;
        MaHang = mh;
        TenHang = th;
        GiaHang = gh;
        SoLuongTonKho = sltk;
        NgayNhap = nn;
    }

    Scanner sc = new Scanner(System.in);

    void nhapThongTin(){
        System.out.println("Nhập loại hàng hóa:");
        LoaiHang = sc.nextLine();
        System.out.println("Nhập mã hàng hóa:");
        MaHang = sc.nextInt();
        System.out.println("Nhập tên hàng hóa:");
        TenHang = sc.nextLine();
        System.out.println("Nhập giá hàng hóa:");
        GiaHang = sc.nextDouble();
        System.out.println("Nhập số lượng tồn kho:");
        SoLuongTonKho = sc.nextInt();
        System.out.println("Ngày nhập kho:");
        NgayNhap = sc.next();
    }

    void inThongTin(){
        System.out.println("---------------");
        System.out.println("Loại: " +LoaiHang);
        System.out.println("Mã: " +MaHang);
        System.out.println("Tên: " +TenHang);
        System.out.println("Giá: " +GiaHang);
        System.out.println("Số lượng tồn kho: " +SoLuongTonKho);
        System.out.println("Ngày nhập: " +NgayNhap);
    }

}

