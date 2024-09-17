import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer>st1=new Stack<>();
        //pushing  element inside the stack
        st1.push(2);
        st1.push(4);
        st1.push(6);
        st1.push(9);
        //printing the stack element
        System.out.println(st1);
        //print the top most element of stack
        System.out.println("The top most element of the stack  before deletion : "+st1.peek());
        st1.pop();
        System.out.println("The top most element of the stack after deletion : "+st1.peek());
        //search an element in  the stack
        System.out.println("Element 2 is present at the position : "+st1.search(2));
        //stack is empty or not
        System.out.println("Is stack is  empty or not :"+st1.empty()); //output is true  / false
    }
}
