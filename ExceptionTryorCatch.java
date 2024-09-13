import java.util.Scanner;
//...........Custom Exception and Throw Keyword.............
class MyException extends Exception{
    public MyException(){}
    public MyException(String msg){
        super(msg);
    }
}
public class ExceptionTryorCatch {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = - 2;
        try {
            if (num2 < 0) {
                Exception e = new MyException("negative number.....");
                throw e;
            } else {
                int result = num1 / num2;
                System.out.println(result);
            }
        }
        catch(Exception e){
            System.out.println("Enter a Valid Number "+e);
        }
    }
}
