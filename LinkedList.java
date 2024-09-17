public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next=null;
        }
    }
    //implementation of insertion at end
    public void insertAtEnd(int newData){
        Node newNode=new Node(newData);
        //Linked list Is Empty
        if(head==null){
            head=new Node(newData);
            return;
        }
        //Linked list is not empty
        newNode.next=null;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
    //Displaying Linked list
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(6);
        list.insertAtEnd(8);
        System.out.println("Before Insertion :");
        list.insertAtEnd(10);
        System.out.println("After Insertion :");
        list.insertAtEnd(20);
    }
}
