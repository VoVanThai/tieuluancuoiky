import java.util.Scanner;

public class GoodsLinkedList {
    Node head = null;
    Node tail = null;
    Goods goods;

    public void them() {
        Goods goods = new Goods();
        Node newGoods = new Node(goods);
        newGoods.goods.nhapThongTin();
        if (head == null) {
            head = newGoods;
            tail = newGoods;
        } else {
            tail.next = newGoods;
            tail = newGoods;
        }
    }

    public void sua() {
        Goods goods = new Goods();

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma hang can sua thong tin: ");
        int id = sc.nextInt();

        Node prevNode = maHangCoTrongDanhSach(id);
        Node current = head;

        if (prevNode == null) {
            System.out.println("Ma hang khong co trong danh sach");
            return;
        }
        while (current != null) {
            if (current.next == prevNode) {
                Node newNode = new Node(goods);
                current.next = newNode;
                newNode.Goods.nhapThongTin();
                newNode.next = prevNode.next;
            }
            current = current.next;
        }

    }

    public void xoaTheoMaHang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang can xoa: ");
        int id = sc.nextInt();

        Node prevNode = maHangCoTrongDanhSach(id);

        if (prevNode == null) {
            System.out.println("Ma hang khong co trong danh sach");
            return;
        }
        Node current;
        current = head;
        while (current.next != null) {
            if (current.next == prevNode) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    boolean maHangCoTrongDanhSach(int id) {
        Node current = head;
        boolean result = false;
        while (current != null) {
            if (current.MaHang.equals(id)) {
                result = true;
                return result;
            }
            current = current.next;
        }
        return result;
    }

    public void timTheoMaHang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang can tim: ");
        int id = sc.nextInt();
        if (true == maHangCoTrongDanhSach(id)) {
            current.Goods.inThongTin();
        } else {
            System.out.println("Khong tim thay");
        }
    }

    boolean giaHangCoTrongDanhSach(double gia) {
        Node current = head;
        boolean result = false;
        while (current != null) {
            if (current.GiaHang.equals(gia)) {
                result = true;
                return result;
            }
            current = current.next;
        }
        return result;
    }

    public void timTheoGiaHang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia hang can tim: ");
        double gia = sc.nextDouble();
        if (true == giaHangCoTrongDanhSach(gia)) {
            current.Goods.inThongTin();
        } else {
            System.out.println("Khong tim thay");
        }
    }

    public void in() {
        Node current = head;
        if (head == null) {
            System.out.println("Danh sach rong");
        } else {
            while (current != null) {
                current.Goods.inThongTin();
                current = current.next;
            }
        }
    }

    public void xepTangDan() { // Bubble Sort
        Node current = head, nextNode = null;
        double temp;

        while (current != null) {
            nextNode = current.next;
            while (nextNode != null) {
                if (current.Goods.GiaHang > nextNode.Goods.GiaHang) {
                    temp = current.Goods.GiaHang;
                    current.Goods.GiaHang = nextNode.Goods.GiaHang;
                    nextNode.Goods.GiaHang = temp;
                }
                nextNode = nextNode.next;
            }
            current = current.next;
        }
    }

    public void xepGiamDan() { // Selection Sort
        Node current = head, maxNode = null, nextNode = null;
        double temp;

        while (current != null) {
            nextNode = current.next;
            maxNode = current;
            while (nextNode != null) {
                if (nextNode.Goods.GiaHang > maxNode.Goods.GiaHang) {
                    maxNode = nextNode;
                }
                nextNode = nextNode.next;
            }

            temp = maxNode.Goods.GiaHang;
            maxNode.Goods.GiaHang = current.Goods.GiaHang;
            current.Goods.GiaHang = temp;

            current = current.next;
        }
    }

}

    public void thongKe(){
        Node current = head;
        int tong1 = 0;
        int tong2 = 0, tong3 = 0, tong4 = 0;
        String loai1 = "banh keo";
        String loai2 = "thoi trang";
        String loai3 = "thuc pham";

        if (head == null) {
            System.out.println("Danh sach rong.");
        } else {
            while (current != null) {
                tong1 += current.Goods.SoLuongTonKho; 
            
            if (current.Goods.LoaiHang == loai1) {
                tong2 += current.Goods.SoLuongTonKho;
            }
            if (current.Goods.LoaiHang == loai2) {
                tong3 += current.Goods.SoLuongTonKho;
            }
            if (current.Goods.LoaiHang == loai3) {
                tong4 += current.Goods.soLuongTonKho;
            }
            current = current.next;                    
        }
    }
    System.out.println("=========== THONG KE =========");
    System.out.println("Tong so luong hang hoa: " + tong1);
    System.out.println("Tong so luong mat hang banh keo: " + tong2);
    System.out.println("Tong so luong mat hang thoi trang: " + tong3);
    System.out.println("Tong so luong mat hang thuc pham: " + tong4);           
}
