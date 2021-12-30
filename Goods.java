import java.util.Scanner;

public class Goods {
    int MaHang;
    String LoaiHang;
    String TenHang;
    double GiaHang;
    int SoLuongTonKho;
    String NgayNhap;

    public Goods() {
    }

    public Goods(int mh, String lh, String th, double gh, int sltk, String nn) {
        LoaiHang = lh;
        MaHang = mh;
        TenHang = th;
        GiaHang = gh;
        SoLuongTonKho = sltk;
        NgayNhap = nn;
    }

    Scanner sc = new Scanner(System.in);

    void nhapThongTin() {
        System.out.println("Nhap ma hang hoa:");
        MaHang = sc.nextInt();
        System.out.println("Nhap loai hang hoa:");
        LoaiHang = sc.nextLine();
        System.out.println("Nhap ten hang hoa:");
        TenHang = sc.nextLine();
        System.out.println("Nhap gia hang hoa:");
        GiaHang = sc.nextDouble();
        System.out.println("Nhap so luong ton kho:");
        SoLuongTonKho = sc.nextInt();
        System.out.println("Ngay nhap kho:");
        NgayNhap = sc.next();
    }

    void inThongTin() {
        System.out.printf("%d %15s %15s %15f %15d %15s", MaHang, LoaiHang, TenHang, GiaHang, SoLuongTonKho, NgayNhap);
    }
}
