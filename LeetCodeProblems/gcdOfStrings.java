package LeetCode;

public class gcdOfStrings {
	 public static  String gcdOfStrings(String str1, String str2) {
	        String s="";
	         int res=0;
	         if(str1.length()==str2.length()){
	            return s;
	         }
	        if (str1.length()>str2.length()){
	                res = str1.length()%str2.length();
	                for(int i=res;i<str1.length();i++){
	                s+= str1.charAt(i);
	                }
	            }
	             
	        return s;
	    }
	public static void main(String[] args) {
		String str1 = "ABABAB";
		String str2 = "ABAB";
		String string ="";
		string =string+gcdOfStrings(str1,str2);
		System.out.println(string);
		
	}
}
