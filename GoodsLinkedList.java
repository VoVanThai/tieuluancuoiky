public class GoodsLinkedList {
    Node head = null;
    Node tail = null;
    Goods goods;
    
    public void them(){ 
        Goods goods = new Goods();
        Node newGoods = new Node(goods);
        newGoods.goods.nhapThongTin();
        if(head == null){
            head = newGoods;
            tail = newGoods;
        } 
        else{
            tail.next = newGoods;
            tail = newGoods;
        }
    }

    boolean maHangCoTrongDanhSach(String id){
        Node current = head;
        boolean result = false;
        while(current!=null){
            if(current.MaHang.equals(id)){
                result =true;
                return result;
            }
            current=current.next;
        }
        return result;
    }

    void timTheoMaHang(String id){
        if(true==maHangCoTrongDanhSach(id)){
            current.Goods.inThongTin();
        }
        else{
            System.out.println("Không tìm thấy");
        }
    }

    boolean giaHangCoTrongDanhSach(String gia){
        Node current = head;
        boolean result = false;
        while(current!=null){
            if(current.GiaHang.equals(gia)){
                result =true;
                return result;
            }
            current=current.next;
        }
        return result;
    }

    void timTheoGiaHang(String gia){
        if(true==giaHangCoTrongDanhSach(gia)){
            current.Goods.inThongTin();
        }
        else{
            System.out.println("Không tìm thấy");
        }
    }

    public void in(){   
        Node current = head;
        if(head == null){
            System.out.println("DANH SÁCH RỖNG!");
        }
        else{
            while(current != null){
                current.Goods.inThongTin();
                current = current.next;
            }
        }
    }

    public void xepTangDan() {   //Bubble Sort
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

    public void xepGiamDan() {   // Selection Sort
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


