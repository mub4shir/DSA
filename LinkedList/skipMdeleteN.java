package LinkedList;

public class skipMdeleteN {
    static class Node{
        int data;
        Node next;
    }

    static Node push(Node headRef, int newData){
        Node nn = new Node();
        nn.data=newData;
        nn.next=headRef;
        headRef=nn;
        return headRef;
    }
    static void printList(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    static void delete( Node head, int m, int n) {
        Node curr = head, t;
        int count;
        while (curr != null) {
            for (count = 1; count < m && curr != null; count++)
                curr = curr.next;
            if (curr == null) return;
            t = curr.next;
            for (count = 1; count <= n && t != null; count++) {
                Node temp = t;
                t = t.next;
            }
            curr.next = t;
            curr = t;
        }
    }

    public static void main(String[] args) {
        Node head =null;
        int m=2,n=3;
        for (int i = 10; i >=1 ; i--) {
            head=push(head,i);
        }
        printList(head);
        System.out.println();
        delete(head,m,n);
        printList(head);
    }
}
