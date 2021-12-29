public class Node {
    Goods goods;
    Node next;

    public Node(){
        goods = null;
        next = null;
    }

    public Node(Goods newGoods) {
        goods = newGoods;
        next = null;
    }

    public Node(Goods newGoods, Node node) {
        goods = newGoods;
        next = node;
    }
}

