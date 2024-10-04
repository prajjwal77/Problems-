public class LL1 {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //insertion at first node
    public void insertAtFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //insertion at end
    public void insertAtEnd(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node tempNode=head;
        while (tempNode.next != null) {
            tempNode=tempNode.next;
        }
        tempNode.next=newNode;
    }
    //Traversal of linked list
    public void traversal(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL1 list=new LL1();
        list.insertAtFirst("EVERYONE");
        list.insertAtEnd("HOW! ARE YOU ?");
        list.traversal();
        list.insertAtFirst("HI!...");
        list.traversal();

    }

}
