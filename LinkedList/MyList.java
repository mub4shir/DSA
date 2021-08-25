package LinkedList;

public class MyList {
    private class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next=null;
        }
    }
    private Node head;
    //private int size;

    public void addAtFirst(int data){
        Node nn = new Node(data);
        nn.next=head;
        head=nn;
    }
    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void addAtEnd(int data){
        Node nn = new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node temp =head;
        while(temp.next!=null) temp=temp.next;
        temp.next=nn;

    }
    public void addAtMiddle(int idx, int data){
        if(idx<0) return;
        if(idx==0) {
            addAtFirst(data);
            return;
        }
        Node nn = new Node(data);
        Node temp =head;
        for(int i=0; i<idx-1; i++) temp=temp.next;
        Node tmp;
        tmp=temp.next;
        temp.next=nn;
        nn.next=tmp;
    }
    public void addAtIndex(int index, int data) {
        if (index < 0) index = 0;
        Node prev = head;
        for (int i = 0; i < index; i++) prev = prev.next;
        Node n = new Node(data);
        n.next = prev.next;
        prev.next = n;
    }
    public void deleteAtFirst(){
        head=head.next;
    }
    public void deleteAtEnd(){
        Node temp=head;
        while(temp.next.next!=null) temp=temp.next;
        temp.next=null;
    }
    public void deleteAtIndex(int idx){
        Node temp=head;
        for(int i=0;i<idx-1;i++) temp=temp.next;
        temp.next=temp.next.next;
    }
    public static void main(String[] args) {
        MyList ll = new MyList();
        ll.addAtEnd(1);
        ll.addAtEnd(2);
        ll.addAtEnd(3);
        ll.addAtEnd(4);
        ll.addAtEnd(5);
        ll.addAtEnd(6);
        ll.addAtEnd(7);
       // ll.addAtFirst(999);
        //ll.deleteAtFirst();
        //ll.deleteAtEnd();
        //ll.deleteAtIndex(2);
        //ll.head=null;
        ll.printList();
        ll.addAtIndex(1,11);
        //ll.addAtMiddle(1,11);
        ll.printList();

    }



}
