import java.util.Scanner;

public class GoodsLinkedListTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("----------MENU----------");
            System.out.println("- 1: Thêm thông tin hàng hóa.");
            System.out.println("- 2: Chỉnh sửa thông tin hàng hóa.");
            System.out.println("- 3: Xoá thông tin hàng hóa.");
            System.out.println("- 4: Tìm kiếm theo mã hàng.");
            System.out.println("- 5: Tìm kiếm theo giá.");
            System.out.println("- 6: Sắp xếp tăng dần theo giá.");
            System.out.println("- 7: Sắp xếp giảm dần theo giá.");
            System.out.println("- 8: In danh sách hàng hóa.");
            System.out.println("- 0: Kết thúc.");
            System.out.print("- Nhập vào sự lựa chọn: ");

            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhập thông tin hàng hóa:");
                    GoodsLinkedList.them();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    GoodsLinkedList.timTheoMaHang();
                    break;
                case 5:
                    GoodsLinkedList.timTheoGiaHang();
                    break;
                case 6:
                    System.out.println("Sắp xếp tăng dần theo giá: ");
                    GoodsLinkedList.xepTangDan();
                    break;
                case 7:
                    System.out.println("Sắp xếp giảm dần theo giá: ");
                    GoodsLinkedList.xepGiamDan();
                    break;
                case 8:
                    System.out.println("Danh sách hàng hóa:");
                    GoodsLinkedList.in();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Nhập lại chức năng");
                    break;
            }

        } while (luaChon != 0);
    }

}





