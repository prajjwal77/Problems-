import java.util.Arrays;

public class NoOfInversion
{
    public static  int inversionCount(int [] arr,int n){
    //fraction definition of inversion
    int count =0;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n;j++){
            //property of inversion
            //i<j
            //arr[i]>arr[j]
            if(arr[i]>arr[j]){
                count++;
            }
        }
    }
    return count;
}
    public static int mergeProcedure(int [] arr,int l,int mid,int h){
        int swap=0;
        //left and right sub array
        int [] lsubarray= Arrays.copyOfRange(arr,l,mid+1);
        int [] rsubarray= Arrays.copyOfRange(arr,mid+1,h);
        int i=0,j=0,k=0;
        while(i<lsubarray.length&&j<rsubarray.length) {
            if (lsubarray[i] <= rsubarray[j]) {
                arr[k++] = lsubarray[i++];
            } else {
                arr[k++]=rsubarray[j++];
                //calculate the no. of swap
                //assignment how to calculate the number of swap
                swap+=(mid+1)-(l+i);
            }
        }
        //copy all the remaining  element from left subarray
        while(i<lsubarray.length){
            arr[k++]=lsubarray[i++];
        }
        //copy all remaining element from right subarray
        while(j<rsubarray.length){
            arr[k++]=rsubarray[j++];
        }
        return swap;
        //count of number of inversion via the divide and conquer approach
    }
    public static int inversionCountDc(int[] arr,int l,int h){
        int count =0;
        if(l<h) {
            //1.Divide the array into two sub problem
            int mid = l + (h - l) / 2;
            //2. Conquer the sub problem using recursive approach
            //left sub array
            count += inversionCountDc(arr, l, mid);
            //right sub array
            count += inversionCountDc(arr, mid + 1, h);
            //3.combine the solution
            count += mergeProcedure(arr, l, mid, h);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int n=arr.length;
        int count=inversionCount(arr,n);
        int countDc=inversionCountDc(arr,0,n-1);
        System.out.println("Inversion by Brute force approach "+count);
        System.out.println("Inversion by Divide and conquer  approach "+countDc);
    }
}
