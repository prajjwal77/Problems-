public class MutableString {
    public static void main(String[] args) {
        StringBuffer str1=new StringBuffer();
        System.out.println(str1.capacity());
        str1.append("abcdefghijklmnop");
        str1.append("qrst");
        System.out.println(str1);

        System.out.println(str1.capacity());
    }
}
