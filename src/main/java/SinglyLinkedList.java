public class SinglyLinkedList <T> {

    private Node node = null;
    private int length = 0;

    public SinglyLinkedList() {
    }

    public int getLength() {
        return length;
    }

    public void add(T data){
        if (this.node == null){
            this.node = new Node(data);
            length++;
        }else{
            this.node.next = new Node(data);
            length++;
        }

    }

    private class Node {
        T data;
        Node next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
