class Node{
    int data;
    Node next;
    //constructor for the node
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist_2022503035_kika {
    Node Head;
    Linkedlist_2022503035_kika(){
        Head = null;
    }
    public void insertEnd(int data){

        Node newNode = new Node(data);
        if(Head == null){
            Head = newNode;
        }
        else {
            Node current = Head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public void display_full(){
        Node current = Head;
        System.out.println("Krithika Ravishankar -  linkedlist - 2022503035");
        if(Head == null){
            System.out.println("The list is empty!");
        }

        while(current.next!=null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print(current.data);
        System.out.println();
    }

    public void insertFirst(int data){
        Node new_Node = new Node(data);
        new_Node.next= Head;
        Head = new_Node;

    }
    public void insertSpecific(int data, int position){
        Node new_Node = new Node(data);
        Node current = Head;
        for(int i =0; i<position -2 && current!=null ; i++){
            current = current.next;
        }
        new_Node.next = current.next;
        current.next = new_Node;
    }

    public void insertAfternode(int before, int data){
        Node current = Head;
        while(current!=null){
            if(current.data == before){
                break;
            }
            current = current.next;
        }
        Node after_node = new Node(data);
        after_node.next = current.next;
        current.next = after_node;

    }

    public void insertBeforenode(int after, int data){
        Node current = Head;
        Node prev_Node = null;
        while(current!=null && current.data != after){
                prev_Node = current ;
                current = current.next;
        }
        Node before_node = new Node(data);
        prev_Node.next = before_node;
        before_node.next = current;
    }
    public void deleteFirst(){
        if(Head ==null){
            System.out.println("The list is empty");
        }
        Node remove = Head;
        Head = Head.next;
        remove = null;
    }
    public void deleteEnd(){
        Node current = Head;
        Node last = Head.next;
        if(Head == null){
            System.out.println("The list is empty");
        }
        if(Head.next == null){
            System.out.println(" the deleted value is : " + Head.data);
            Head = Head.next;
        }
        while(last.next !=null) {
            current = last;
            last = last.next;
        }
        current.next = null;

    }

    public void deleteByValue(int value){
        Node current = Head;
        Node value_node = null;
        while(current!=null){
            if(current.data == value){
                value_node.next = current.next;
            }
            value_node = current;
            current = current.next;
        }

    }

    public void deleteByposition(int position){
        if (position < 0) {
            System.out.println("It is invalid position");
        }
        if (position == 0) {

            if (Head == null) {
                return;
            }
            Head = Head.next;
        }
        Node current = Head;
        Node previous = null;
        int count = 0;

        while (current != null && count < position) {
            previous = current;
            current = current.next;
            count++;
        }

        if (current == null) {
            return;
        }

        previous.next = current.next;
    }
    public static void main(String[] args){
        Linkedlist_2022503035_kika list = new Linkedlist_2022503035_kika();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertFirst(0);
        list.insertSpecific(15,3);
        list.insertAfternode(20, 25);
        list.insertBeforenode(10,5);
        list.display_full();
        list.deleteFirst();
        list.deleteEnd();

        list.display_full();
        list.deleteByValue(20);
        list.display_full();
        list.deleteByposition(2);
        list.display_full();
    }
}
