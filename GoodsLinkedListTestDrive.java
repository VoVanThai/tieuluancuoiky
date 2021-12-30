import java.util.Scanner;

public class GoodsLinkedListTestDrive {
    public static void main(String[] args) {
        GoodsLinkedList goodsLinkedList = new GoodsLinkedList();
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("- 1: Them thong tin hang hoa.");
            System.out.println("- 2: Chinh sua thong tin hang hoa.");
            System.out.println("- 3: Xoa thong tin hang hoa theo ma.");
            System.out.println("- 4: Tim kiem theo ma hang.");
            System.out.println("- 5: Tim kiem theo gia.");
            System.out.println("- 6: Sap xep tang dan theo gia.");
            System.out.println("- 7: Sap xep giam dan theo gia.");
            System.out.println("- 8: In danh sach hang hoa.");
            System.out.println("- 9: Thong ke.");
            System.out.println("- 0: Ket thuc.");
            System.out.println("- Nhap su lua chon: ");

            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhap thong tin hang hoa:");
                    GoodsLinkedList.them();
                    break;
                case 2:
                    GoodsLinkedList.sua();
                    break;
                case 3:
                    GoodsLinkedList.xoaTheoMaHang();
                    System.out.println("Da xoa!");
                    break;
                case 4:
                    System.out.println("================= DANH SACH HANG HOA =========== ");
                    System.out.printf("%s %15s %15s %15s %20s %15s", "Ma", "Loai", "Ten", "Gia", "So luong ton kho",
                            "Ngay nhap");
                    GoodsLinkedList.timTheoMaHang();
                    break;
                case 5:
                    System.out.println("================= DANH SACH HANG HOA =========== ");
                    System.out.printf("%s %15s %15s %15s %20s %15s", "Ma", "Loai", "Ten", "Gia", "So luong ton kho",
                            "Ngay nhap");
                    GoodsLinkedList.timTheoGiaHang();
                    break;
                case 6:
                    System.out.println("Sap xep tang dan theo gia ");
                    System.out.println("================= DANH SACH HANG HOA =========== ");
                    System.out.printf("%s %15s %15s %15s %20s %15s", "Ma", "Loai", "Ten", "Gia", "So luong ton kho",
                            "Ngay nhap");
                    GoodsLinkedList.xepTangDan();
                    break;
                case 7:
                    System.out.println("Sap xep giam dan theo gia: ");
                    System.out.println("================= DANH SACH HANG HOA =========== ");
                    System.out.printf("%s %15s %15s %15s %20s %15s", "Ma", "Loai", "Ten", "Gia", "So luong ton kho",
                            "Ngay nhap");
                    GoodsLinkedList.xepGiamDan();
                    break;
                case 8:
                    System.out.println("================= DANH SACH HANG HOA =========== ");
                    System.out.printf("%s %15s %15s %15s %20s %15s", "Ma", "Loai", "Ten", "Gia", "So luong ton kho",
                            "Ngay nhap");
                    GoodsLinkedList.in();
                    break;
                case 9:
                    GoodsLinkedList.thongKe();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Nhap lai chuc nang.");
                    break;
            }

        } while (luaChon != 0);
        // Dữ liệu
        GoodsLinkedList.them(1001, "banh keo", "banh oreo", 8000, 800, "1/1/2021");
        GoodsLinkedList.them(1002, "banh keo", "banh bong lan", 12000, 200, "1/1/2021");
        GoodsLinkedList.them(1003, "banh keo", "keo mut", 2000, 900, "1/1/2021");
        GoodsLinkedList.them(1004, "banh keo", "keo ngam", 3000, 900, "1/1/2021");
        GoodsLinkedList.them(1005, "banh keo", "banh quy", 15000, 800, "1/1/2021");
        GoodsLinkedList.them(1006, "banh keo", "keo cao su", 5000, 900, "1/1/2021");
        GoodsLinkedList.them(1007, "thoi trang", "quan jean", 12000, 100, "1/2/2021");
        GoodsLinkedList.them(1008, "thoi trang", "ao khoac", 90000, 150, "1/2/2021");
        GoodsLinkedList.them(1009, "thoi trang", "ao thun", 50000, 200, "1/2/2021");
        GoodsLinkedList.them(1010, "thoi trang", "dong ho", 150000, 100, "1/2/2021");
        GoodsLinkedList.them(1011, "thoi trang", "giay the thao", 200000, 150, "1/2/2021");
        GoodsLinkedList.them(1012, "thoi trang", "ao somi", 150000, 100, "1/2/2021");
        GoodsLinkedList.them(1013, "thuc pham", "trung", 4000, 900, "1/3/2021");
        GoodsLinkedList.them(1014, "thuc pham", "sua", 7000, 800, "1/3/2021");
        GoodsLinkedList.them(1015, "thuc pham", "thit ga", 40000, 600, "1/3/2021");
        GoodsLinkedList.them(1016, "thuc pham", "thit bo", 70000, 500, "1/3/2021");
        GoodsLinkedList.them(1017, "thuc pham", "ca", 30000, 800, "1/3/2021");
        GoodsLinkedList.them(1018, "thuc pham", "tom", 40000, 750, "1/3/2021");
        GoodsLinkedList.them(1019, "thuc pham", "cua", 90000, 650, "1/3/2021");
        GoodsLinkedList.them(1020, "thuc pham", "rau muong", 5000, 350, "1/3/2021");

    }
}
