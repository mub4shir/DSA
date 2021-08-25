package LinkedList;

public class Main {
    static Node head ;
    class Node{
        int data;
        Node next;
        public Node(Node next, int data ){
            this.data=data;
            this.next=next;
        }

    }
    void printMiddle(Node head){
        int count=0;
        Node mid=head;
        while(head!=null){
            if(count%2==1)
                mid=mid.next;
            ++count;
            head=head.next;
        }
        if(mid!=null){
            System.out.print("The middle element is ["+mid.data+"]\n");
        }

    }
    void push(Node headRef, int newData){
        Node newNode = new Node(headRef,newData);
        head=newNode;
    }
    void printList(Node head){
        while(head!=null){
            System.out.print(head.data+ "->");
            head=head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Main ll=new Main();
        for(int i=5;i>0;i--){
            ll.push(head,i);
            ll.printList(head);
            ll.printMiddle(head);
        }
    }
}
