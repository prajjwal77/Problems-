public class LL2 {
    Node head;
    private int size;
    LL2(){
        this.size=0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    //insertion at first
        public void insertionAtFirst(String data){
        Node newNode=new Node(data);
            size++;
            if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        }
        //insertion at end
        public void insertionAtEnd(String data){
        Node newNode=new Node(data);
            size++;
            if(head==null){
            head=newNode;
            return;
        }
            Node tempNode=head;
        while (tempNode.next!=null){
            tempNode=tempNode.next;
        }
        tempNode.next=newNode;
        }

    //deletion at first
        public void deletionAtFirst(){
            size--;
            if(head==null){
            System.out.println("The list5 is empty :");
            return;
        }
        head=head.next;
    }
    //deletion at End
    public void deletionAtEnd(){
        if(head==null){
            System.out.println("The list is empty :");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    public void traversal(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println(" null");

    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL2 list1=new LL2();
        list1.insertionAtFirst("Hello!");
        list1.insertionAtEnd("Namaste!");
        list1.insertionAtEnd("Jai Shree Ram");
        list1.insertionAtEnd("Ram RAm");
        list1.deletionAtEnd();
        list1.traversal();
        list1.deletionAtFirst();
        list1.traversal();
        System.out.println(list1.getSize());
    }
}
