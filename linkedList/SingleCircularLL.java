package linkedList;

public class SingleCircularLL {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    
    Node head;
    
    public SingleCircularLL(){
        head = null;
    }

    public Node insertAtStart(int data){
        Node newNode = new Node(data);
        newNode.next = null;

        if(head == null){
            head = newNode;
            newNode.next = head;
        } else{
            Node curr = head;
            while(curr.next != head){
                curr = curr.next;
            }

            curr.next = newNode;
            newNode.next = head;
            head = newNode;
        }
        return head;
    }


    public Node insertAtEnd(int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if(head==null){
            head = newNode;
            newNode.next = head;
        } else{
            Node curr = head;
            while(curr.next!=head){
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.next = head;
        }
        return head;
    }

    public void display() {
        if (head == null) {
            return;
        }
        Node curr = head;
        while (true) {
            System.out.print(curr.data + " ");
            curr = curr.next;
            if (curr == head) {
                break;
            }
        }
        System.out.println();
    }




    public static void main(String[] args) {
        SingleCircularLL list = new SingleCircularLL();
        list.insertAtStart(4);
        list.insertAtStart(6);
        list.insertAtStart(1);
        list.insertAtStart(8);
        list.insertAtStart(2);

        list.insertAtEnd(19);

        list.display();
    }
}