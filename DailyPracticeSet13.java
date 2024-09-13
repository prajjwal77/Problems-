public class DailyPracticeSet13 {
    //Using loop to print A to z Alphabets
    //for loop
    public static void main(String[] args) {
        char c;
        for(c='A';c<='Z';c++){
            System.out.print(c +" ,");
        }
        System.out.println();
        //while loop
        char ch='A';
        while(ch!='Z'){
            System.out.print(ch + ", ");
            ++ch;
        }
    }
}
