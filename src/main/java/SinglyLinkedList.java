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
        Node prev = head;
        Node now = head.next;

        while (prev != null && now != null)
        {
            if(prev.data.equals(data)){
                this.length--;
                prev = now;
                now = prev.next;
            }
            else{
                //newNode.addtoNode(prev.data);
                prev = head.next;
                now = prev.next;
            }
        }

    }

    public void insert(T data){
        
    }

    private class Node {
        T data;
        Node next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }

        public void addtoNode(T data){
            if(this == null){
                this.data = data;
            }else{
                this.next.data = data;
            }

        }

        @Override
        public String toString() {
            return  data + " ";

        }
    }
}
