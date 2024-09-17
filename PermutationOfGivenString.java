public class PermutationOfGivenString {
    public static String swap(String str,int i,int j){
        char[] charArrays=str.toCharArray();
        char temp=charArrays[i];
        charArrays[i]=charArrays[i];
        charArrays[j]=temp;
        return String.valueOf(charArrays);

    }
    public static void permute(String str,int l,int r){
        if(l==r){
            System.out.println(str);
        }
        else {
            for(int i=l;i<=r;i++){
                str=swap(str,l,r);
                permute(str,l+1,r);
                //backtracking
                str=swap(str,l,r);
            }
        }
    }

    public static void main(String[] args) {
        String str1="XY";
        int n1= str1.length();
        System.out.println("FOR the string : "+str1+"Permutation are :");
        permute(str1,0,n1-1);
        System.out.println();
        String str2="ABC";
        int n2= str2.length();
        System.out.println("FOR the string : "+str2+"Permutation are :");
        permute(str2,0,n2-1);
    }
}
