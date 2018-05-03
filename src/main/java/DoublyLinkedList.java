public class DoublyLinkedList <T>  {

    private Node head = null;
    private int length = 0;

    public DoublyLinkedList() {
    }

    public int getLength() {
        return length;
    }

    public void add(T data){

        if (this.head == null){
            this.head = new Node(data);
            length++;
        }else if(this.head.next == null){
            this.head.next = new Node(data);
            this.head.next.before = this.head;
            length++;
        }else{
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            Node holder = temp;
            temp.next = new Node(data);
            temp.before = holder;
            length++;
        }
    }

    @Override
    public String toString() {
        Node temp = head;
        String result = "";
        while(temp != null) {
            result += temp.data + " ";
            temp = temp.next;
        }
        return result;
    }

    public void remove(T data){
        Node temp = head;
        if(this.head.data.equals(data)){
            this.head = temp.next;
            this.head.before = null;
            length--;
        }
        while(temp.next != null) {
            if(temp.next.data.equals(data)){
                Node holder = temp.before;
                temp.next = temp.next.next;
                temp.next.before = holder;
                length--;
                break;
            }
            temp = temp.next;
        }

    }

    public void insert(T data, int index){
        if(index == 0){
            Node holder = this.head;
            this.head = new Node(data);
            this.head.next = holder;
        }
        if(index > length){
            this.add(data);
        }
        if(index < 0){
            throw new NullPointerException();
        }
        Node temp = head;
        for(int i = 0; i < length; i++){
            if(i == index - 1){
                Node holder = temp.next;
                temp.next = new Node(data);
                temp.next.next = holder;
                length++;
                break;
            }
            temp = temp.next;
        }
    }

    private class Node {
        T data;
        Node next;
        Node before;
        Node(T data) {
            this.data = data;
            this.next = null;
            this.before = null;
        }

    }
}
