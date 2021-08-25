package LinkedList;

public class MyTestLinkedList {
    private class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    private Node head;

    public void addAtFirst(int data){
        Node nn = new Node(data);
        nn.next=head;
        head=nn;
    }
    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void addAtEnd(int data){
        Node nn = new Node(data);
        if(head==null) {
            head = nn;
            return;
        }
        Node temp =head;
        while(temp.next!=null) temp=temp.next;
        temp.next=nn;
    }
    public void addAtMiddle(int idx, int data){
        if(idx<0) return;
        if(idx==0){
            addAtFirst(data);
            return;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++) temp=temp.next;
        Node nn = new Node(data);
        nn.next=temp.next;
        temp.next=nn;

    }
    public void addAtIndex(int idx,int data){
        if(idx<0) idx=0;
        Node prev =head;
        for(int i =0;i<idx-1;i++) prev=prev.next;
        Node nn = new Node(data);
        nn.next=prev.next;
        prev.next=nn;
    }
    public void deleteAtFirst(){
        head=head.next;
    }
    public void deleteAtEnd(){
        Node temp =head;
        while(temp.next.next!=null) temp=temp.next;
        temp.next=null;
    }
    public void  deleteAtIndex(int idx){
        //if(idx==) return;
        if(idx==0) deleteAtFirst();
        Node temp =head;
        for (int i = 0; i < idx-1; i++) temp=temp.next;
        temp.next=temp.next.next;
    }
    public void nthFromEnd(int n){
        Node temp1 = head;
        Node temp2 = head;
        for (int i=0;i<n;i++) temp2=temp2.next;
        while(temp2.next!=null){
            temp2=temp2.next;
            temp1=temp1.next;
        }
        System.out.println(temp1.data);
        temp1.next=temp2;
    }
    public void reverse(){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        while(prev!=null){
            System.out.print(prev.data+"->");
            prev=prev.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyTestLinkedList ll =  new MyTestLinkedList();
        ll.addAtFirst(30);
        ll.addAtEnd(40);
        ll.addAtEnd(50);
        ll.addAtEnd(60);
        ll.addAtEnd(70);
        ll.printList();
        ll.addAtIndex(3,11);
        ll.deleteAtEnd();
        ll.printList();
        ll.nthFromEnd(2);
        ll.printList();
        //ll.reverse();






    }





}
