package LinkedList;

public class  ReordingLinkedList {
    private class Node{
        int data;
        Node next;
        Node(Node next,int data){
            this.data=data;
            this.next=next;
        }
    }
    static Node head;

    void push(Node nodeRef, int newData ){
        Node nn = new Node(nodeRef,newData);
        head=nn;
    }
    void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    Node printMiddle(){
        Node t1=head;
        Node t2=head;
        while(t2!=null&&t2.next!=null){
            t1=t1.next;
            t2=t2.next.next;
        }
        return t1;
    }
//    void printFirstPart(Node n){
//        Node temp=head;
//        while(temp!=n){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.print("null");
//    }
//    void printSecondPart(Node n){
//        Node temp=n;
//        while(temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.print("null");
//    }
    Node reverseSecondPart(Node n){
        Node prev=null;
        Node curr=n;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    void foldLinkedList(Node h1, Node h2){
        Node first =h1;
        Node second=h2;
        while(second.next!=null){
            Node temp= first.next;
            first.next=second;
            first=temp;
            temp=second.next;
            second.next=first;
            second=temp;
        }
    }



    public static void main(String[] args) {
        ReordingLinkedList ll = new ReordingLinkedList();
        for (int i = 10; i > 0; i--) {
            ll.push(head, i);

        }
        ll.printList(head);
        Node h2 = ll.reverseSecondPart(ll.printMiddle());
        System.out.println();
        ll.printList(head);
        System.out.println();
        ll.printList(h2);
        System.out.println();
        ll.foldLinkedList(head, h2);
        ll.printList(head);
    }
}

