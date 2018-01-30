package chapter2;

public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }
    public void append(int data) {
        Node end = new Node(data);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }
}
