import java.util.Scanner;

public class practiceProblem {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int x=scan.nextInt();
//        int y=scan.nextInt();
//        int floor1=x%10;
//        int floor2=y%10;
//        int i=0;
//        while (floor1!=floor2){
//            i++;
//        }
//        System.out.println(" the number of floors x need to travel to reach y's room "+ i);
//        int n=7;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i==0 && j>0 && j<(n-1) || j==0 && i>0 && i<=(n-1)/2 || i==((n-1)/2)+1 && j>0 && j<(n-1) || j<(n-1) && i>0 && i<=(n-1)/2) {
//                    System.out.print("* ");
//                }
//                System.out.print("   ");
//            }
//            System.out.println();
//        }

//        int n=10;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i==0 ||j==0 ||j==n){
//                    System.out.print("*");
//                }
//                System.out.print("  ");
//            }
//            System.out.println();
//        }

        int n=11;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // if(i==0 && j<(n-1) || j==0 && i<n-1 || i+j<=(n-1)/2 || j==n-1 && i<n-1 || j-i>=(n-1)/2 || i==n-1 && j<=n-1 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
                if(i==1 && j>=1 && j<(n-1)
                        || i>1&& i<n-1 && j==(n-1)/2
                        || j>1 && j<(n-1)/2 && i==n-2
                        || j>1 && j<(n-1)/2-1 && i==n-3)
                {
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.print("    ");
            for(int j=0;j<n;j++){
                // if(i==0 && j<(n-1) || j==0 && i<n-1 || i+j<=(n-1)/2 || j==n-1 && i<n-1 || j-i>=(n-1)/2 || i==n-1 && j<=n-1 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
                if(      i==1 && j>1 && j<(n-2)
                        || i>1&& i<n-1 && j>=1 &&j<=2
                        || j>=8 && j<(n-1) && i>1 && i<=n-2
                        || i==(n-1)/2 && j==(n-1)/2+1
                        || i==(n-1)/2 && j==(n-1)/2-1
                        || i==(n-1)/2 && j==(n-1)/2  )
                {
                    System.out.print("   ");
                }
                else{
                    System.out.print("*  ");
                }
            }
            System.out.print("   ");

            for(int j=0;j<n;j++){
                // if(i==0 && j<(n-1) || j==0 && i<n-1 || i+j<=(n-1)/2 || j==n-1 && i<n-1 || j-i>=(n-1)/2 || i==n-1 && j<=n-1 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
                if( j>=2 && j<=3 && i>=1 && i<n-3
                    || j>=7 && j<=8 && i>=1 && i<n-3
                    || i>=(n-3)&& i<(n-2) && j>=4 && j<=6)
                {
                    System.out.print("   ");
                }
                else{
                    System.out.print("*  ");
                }
            }
            System.out.print("    ");
            for(int j=0;j<n;j++){
                // if(i==0 && j<(n-1) || j==0 && i<n-1 || i+j<=(n-1)/2 || j==n-1 && i<n-1 || j-i>=(n-1)/2 || i==n-1 && j<=n-1 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
                if(      i==1 && j>1 && j<(n-2)
                        || i>1&& i<n-1 && j>=1 &&j<=2
                        || j>=8 && j<(n-1) && i>1 && i<=n-2
                        || i==(n-1)/2 && j==(n-1)/2+1
                        || i==(n-1)/2 && j==(n-1)/2-1
                        || i==(n-1)/2 && j==(n-1)/2  )
                {
                    System.out.print("   ");
                }
                else{
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }

    }
}
