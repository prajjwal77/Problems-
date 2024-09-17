public class BackTrackingTilesProblem {
    public static  int TilesProblem(int n){
        //base case
        if(n<=3){
            return  n;
        }
        else {
            return TilesProblem(n-1)+TilesProblem(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("For n=1 ,total ways  :"+TilesProblem(1));
        System.out.println("For n=2 ,total ways  :"+TilesProblem(2));
        System.out.println("For n=3 ,total ways  :"+TilesProblem(3));
        System.out.println("For n=4 ,total ways  :"+TilesProblem(4));
        System.out.println("For n=5 ,total ways  :"+TilesProblem(5));
    }
}
