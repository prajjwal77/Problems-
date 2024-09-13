import java.lang.reflect.Array;

public class DailyPracticeSet31 {
    public static void main(String[] args) {
        //Concatenate two arrays  using arraycopy....
        int [] array1={1,2,3,4};
        int [] array2={5,6,7,8};
        int alen=array1.length;
        int blen=array2.length;
        int [] result=new int [alen+ blen];
        System.arraycopy(array1,0,result,0,alen);
        System.arraycopy(array2,0,result,alen,blen);

        for(int element:result){
            System.out.print(element+" ");
        }

    }
}
