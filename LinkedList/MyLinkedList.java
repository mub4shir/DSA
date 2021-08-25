package LinkedList;

public class MyLinkedList {
    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    int size = 0;

    public MyLinkedList() {
        size = 0;
        head = new Node(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node curr = head;
        for (int i = 0; i < index; i++) curr = curr.next;
        return curr.val;
    }
    public void addAtHead(int val){
        addAtIndex(0,val);
    }
    public void addAtTail(int i, int val){
        addAtIndex(size,val);
    }
    public void addAtIndex(int index,int val){
        if(index>size) return;
        if(index<0) index=0;
        ++size;
        Node prev=head;
        for(int i=0;i<index;i++) prev=prev.next;
        Node n = prev.next;
        prev.next=n;
    }
    public void deleteAtIndex(int index){
        if(index<0 || index>=size) return;
        size--;
        Node prev =head;
        for (int i=0; i<index;++i) prev=prev.next;
        prev.next=prev.next.next;
    }


    public static void main(String[] args) {
        MyLinkedList obj= new MyLinkedList();
        int param_1 = obj.get(0);
        System.out.println(param_1);
        obj.addAtHead(10);
        obj.addAtIndex(2,9);

    }


}
