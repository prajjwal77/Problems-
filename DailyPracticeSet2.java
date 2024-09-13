class AddBinary {
    static String add_binary(String x, String y) {
        int num1 = Integer.parseInt(x, 2);
        //converting binary string into integer (decimal number)
        int num2 = Integer.parseInt(y, 2);
        //converting binary string into integer (decimal number)
        int sum = num1 + num2;
        String res = Integer.toBinaryString(sum);
        return res;
    }


    public static void main(String[] args) {
        String x = "011011", y = "1010111";
        System.out.println(add_binary(x,y));

    }
}
