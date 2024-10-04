public class LL2Revision {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //insertion at first
    public void insertionFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //insertion at end
    public void insertionAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    //deletion at first
    public void deletionAtFirst(){
        if(head==null){
            System.out.println("List is empty :");
            return;
        }
        head=head.next;
    }
    //deletion at end of list
    public void deletionAtEnd(){
        if(head==null){
            System.out.println("List is empty :");
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public void traversal(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //insertion  after a  node
    public  void afterNode(Node prev,int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp!=prev){
            temp=temp.next;
        }
        temp.next=prev.next;
        newNode.next=temp.next;
        prev.next=newNode;

    }
    public void deletionOfAnyNode(Node prev){
        if(head==null){
            System.out.println("The List is empty :");
            return;
        }
        Node temp=head;
        Node lastnode=head.next;
        while(temp!=prev){
            temp=temp.next;
            lastnode=lastnode.next;
        }
        temp.next=lastnode.next;
        temp=lastnode;
    }


    public static void main(String[] args) {
        LL2Revision list2=new LL2Revision();
        list2.insertionAtEnd(90);
        list2.insertionFirst(100);
        list2.insertionFirst(10);
        list2.insertionAtEnd(200);
        list2.traversal();
        list2.afterNode(list2.head.next,77);
        list2.traversal();
        list2.deletionOfAnyNode(list2.head);
        list2.traversal();
    }
}
