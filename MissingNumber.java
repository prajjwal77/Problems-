public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,5,7};
        int n=arr.length;
        //sum of natural  number is an array
        int sum_natural_number=((n+1)*(n+2))/2;
        int sum=0;
        //sum of current element
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int missing_no=0;
        missing_no=sum_natural_number-sum;
        System.out.println("Missing Number is = "+missing_no);
    }
}
