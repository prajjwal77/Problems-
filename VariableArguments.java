public class VariableArguments {
    static int sum( int x,int ...arr)//int this method at least pass one argument required
//static int sum(int ...arr)      int this method  pass any number of argument
    {

        int result=x;
        for(int i:arr){
            result +=i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of  integer: " +sum(10));
        System.out.println("The sum of  integer: " +sum(10,23));
        System.out.println("The sum of  integer: " +sum(10,23,44));

    }
}
