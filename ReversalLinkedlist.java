 public class ReversalLinkedlist {
     static Node head;

     class Node {
         int data;
         Node next;

         Node(int data) {
             this.data = data;
             this.next = null;
         }
     }

     public void insertionAtFirst(int data) {
         Node newNode = new Node(data);
         if (head == null) {
             head = newNode;
             return;
         }
         newNode.next = head;
         head = newNode;
     }

     public void insertionAtEnd(int data) {
         Node newNode = new Node(data);
         if (head == null) {
             head = newNode;
             return;
         }
         Node temp = head.next;
         while (temp.next!= null) {
             temp = temp.next;
         }
         temp.next=newNode;
     }
     public void traversal(){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+"->");
             temp=temp.next;
         }
         System.out.println("Null");
     }
     public Node OddEven(Node head){
     if(head==null){
         return head;
     }
     Node oddhead=head;
     Node odd=head;
     Node evenHead=head.next;
     Node even=head.next;
     while(odd!=null&&odd.next!=null&&even!=head&&evenHead!=null){
         odd.next=odd.next.next;
         odd=odd.next;
         evenHead=even.next.next;
         even=even.next;
     }
     odd.next=evenHead;
     return  oddhead;
     }

     public static void main(String[] args) {
        ReversalLinkedlist rlist=new ReversalLinkedlist();
        rlist.insertionAtFirst(10);
        rlist.insertionAtFirst(20);
        rlist.insertionAtFirst(40);
        rlist.insertionAtFirst(50);
        rlist.traversal();
       //System.out.println(rlist.OddEven(head));

     }
 }