import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
         int[] arrays=new int[5];
         int[] arrays1=new int [5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arrays.length;i++){
            arrays[i]=sc.nextInt();
        }
        System.out.println("Printing  Entered Arrays....");
        for(int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
        System.out.println("Sorting OF Arrays......");
        for(int i=0;i<arrays.length;i++){
            for(int j=i+1;j<arrays.length;j++){
                if (arrays[i]>arrays[j]){
                    int temp=arrays[i];
                    arrays[i]=arrays[j];
                    arrays[j]=temp;
                }
            }
            System.out.print(arrays[i]+" ");
        }
        for(int i=0;i<arrays.length;i++){
         for(int j=i+1;j<arrays.length+1;j++){
             if(arrays[i]!=arrays[j])
             {
                 arrays1[i]=arrays[i];
             }
         }
            System.out.println(arrays1[i]+" ");
        }

    }
}
