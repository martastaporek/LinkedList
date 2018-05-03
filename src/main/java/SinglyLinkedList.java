public class SinglyLinkedList <T> {

    private Node head = null;
    private int length = 0;

    public SinglyLinkedList() {
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
            length++;
        }else{
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
            length++;
        }
    }

    @Override
    public String toString() {
        Node temp = head;
        String result = "";
        while(temp != null)
        {
            result += temp.data + " ";
            temp = temp.next;
        }
        return result;
    }

    public void remove(T data){
        Node temp = head;
        if(this.head.data.equals(data)){
            this.head = temp.next;
            length--;
        }
        while(temp.next != null) {
            if(temp.next.data.equals(data)){
                temp.next = temp.next.next;
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
        Node(T data) {
            this.data = data;
            this.next = null;
        }

    }
}
