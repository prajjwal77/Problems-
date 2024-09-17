public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        int n=arr.length;
        boolean b=true;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                b=false;
                System.out.println("Not Palindrome  array ..");
                break;
            }
        }
        if(b==true){
            System.out.println("Palindrome  array ...");
        }
       // TIME COMPLEXITY OF THIS  IS O(n)
        //SPACE COMPLEXITY OF THIS PROGRAM IS  O(1)
    }
}
