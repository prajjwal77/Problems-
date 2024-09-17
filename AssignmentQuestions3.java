public class AssignmentQuestions3 {
    public static void main(String[] args) {
        int  arr[] = {34,21,54,65,43};
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] > arr[j]) {
                   max=arr[i];
                }
            }
        }
        System.out.println(max);
    }
}
