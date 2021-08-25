package LinkedList;
class LinkedList2 {
        Node head;
        class Node {
            int data;
            Node next;
            Node(int d){
                data = d;
                next=null;
            }
        }
        void printMiddle(){
            Node slow=head;
            Node fast=head;
            if(head!=null){
                while(fast !=null && fast.next!=null){
                    fast=fast.next.next;
                    slow=slow.next;
                }
                System.out.println("the middle elelemt iss["+slow.data+"]\n");
            }

        }
        public void push(int newData){
            Node newNode=new Node(newData);
            newNode.next=head;
            head=newNode;
        }
        public void printList(){
            Node tnode = head;
            while (tnode != null){
                System.out.print(tnode.data+"->");
                tnode = tnode.next;
            }
            System.out.println("NULL");
        }

        public static void main(String[] args) {
            LinkedList2 llist= new LinkedList2();
            for (int i=8; i>0; --i){
                llist.push(i);
                llist.printList();
                llist.printMiddle();
            }
        }
    }

