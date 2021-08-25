package LinkedList;

class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            this.data = d;
            next = null;
        }
    }
    public void printList(){
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public void printSize(){
            Node tmp = head;
            int count=0;
            while(tmp!=null) {count++; tmp=tmp.next;}
            System.out.println("Size: "+count);
        }
        public void findMiddle() {
            Node tmp =head;
            int count = 0;
            while (tmp != null) {
                count++;
                tmp = tmp.next;
            }
            int i = 0;
            tmp=head;
            while (i < count / 2) {
                i++;
                tmp=tmp.next;
            }
            System.out.println();
            System.out.println("i is: "+i);
            System.out.println("Middle is: "+tmp.data);
        }
    public static void main(String[] args){
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        llist.head.next = second;
        second.next = third;
        third.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;
        seven.next=eight;
        llist.printSize();
        llist.printList();
        llist.findMiddle();

    }
}
