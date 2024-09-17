import javax.management.InstanceNotFoundException;
import java.util.Stack;
import java.util.*;

public class QueueUsingStack {
    static Stack <Integer> s1=new Stack<>();
    static Stack <Integer> s2=new Stack<>();
    //insertion of data in queue
    static void enQueue1(int data){
        s1.push(data);
    }
    //deletion of the data from the queue - FIF0
    static int deQueue(){
        int ele;
        if(s1.empty()&&s2.empty()){
            System.out.println("Queue is Empty ");
            System.exit(0);
        }
        //push ell the element from stack1 to stack2
        if(s1.empty()){
            while(!s1.empty()){
                ele=s1.pop();
                s2.push(ele);
            }
        }
        //pop the top element from stack2
        ele=s2.pop();
        return ele;
    }

    public static void main(String[] args) {
        QueueUsingStack q=new QueueUsingStack();
        //function calling for insertion int the queue
          q.enQueue1(1);
        //function calling for deletion
        System.out.println("Deletion of element  is : "+q.deQueue());
    }
}
