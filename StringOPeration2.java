import org.w3c.dom.ls.LSOutput;

public class StringOPeration2 {
    public static void main(String[] args) {
        //Reverse the String  ---->
        // pwskill java --> java pwskill
    String str1="pwskill java";
    String str2="";
    String Sarr[]=str1.split(" ");
    for(int i=Sarr.length-1;i>=0;i--){
        str2=str2+Sarr[i]+" ";
        }
        System.out.println(str2);
    }
}
