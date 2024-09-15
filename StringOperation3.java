public class StringOperation3 {
    public static void main(String[] args) {
        //reverse the string pwskill java --> llikswp avaj
        String str1="pwskill java";
        String  str2="";
        String arr[]=str1.split(" ");
        for(String  element:arr){
            for(int i=element.length()-1;i>=0;i--) {
                str2 = str2 + element.charAt(i);
            }
            str2 =str2+" ";
        }
        System.out.println(str2);
    }
}
