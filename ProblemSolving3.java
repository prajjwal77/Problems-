import  java.util.Scanner;
public class ProblemSolving3 {
    public static void main(String[] args) {
        //1. Solution-----------------------------
//        int a = 10;
//        if (a == 11) {
//            System.out.println("I am 11");
//        } else {
//            System.out.println("I am Not 11");
//        }
//        //2. Solution--------------------------
//        int s1, s2, s3;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your java marks");
//        s1=sc.nextInt();
//        System.out.println("Enter your c++ marks");
//        s2=sc.nextInt();
//        System.out.println("Enter your c marks");
//        s3=sc.nextInt();
//        float avg=(s1+s2+s3)/3;
//        System.out.println("Your overall Percentage is :"+avg);
//        if(avg>=40 && s1>=33 && s2>=33 && s3>=33)
//        {
//            System.out.println("Congratulation!, You have been promoted");
//
//        }
//        else {
//            System.out.println("Sorry!, You have not been promoted");
//        }
        //3. Solution----------------------------------------
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per annum :");
        float income=sc.nextFloat();
        float tax=0f;
        if(income<=2.5f){
            tax= tax +0;
        }
        else if(income>2.5f && income<=5f)
        {
            tax= tax+0.05f* (income-2.5f);
        }
        else if(income>=5f && income<=10f)
        {
            tax=tax +0.05f *(income-2.5f);
            tax= tax+0.2f *(income-5f);
        }
        else if(income>10f){
            tax=tax +0.05f *(income-2.5f);
            tax= tax+0.2f *(income-5f);
            tax=tax+0.3f *(income-10.0f);
        }
      System.out.println("The total tax pay by employee is :"+tax);
        //4. Solution--------------------------------------------
  //  Scanner sc=new Scanner(System.in);
//        System.out.println("Enter 1-7 any number:");
//    int day=sc.nextInt();
//            switch (day)
//    {
//        case 1:
//            System.out.println("Monday");
//            break;
//        case 2:
//            System.out.println("Tuesday");
//            break;
//        case 3:
//            System.out.println("Wednesday");
//            break;
//        case 4:
//            System.out.println("Thursday");
//            break;
//        case 5:
//            System.out.println("Friday");
//            break;
//        case 6:
//            System.out.println("Saturday");
//            break;
//        case 7:
//            System.out.println("Sunday");
//            break;
//        default:
//            System.out.println("Wrong Input");
//            //5.SOlution-----------------------------------------
//        System.out.println("ENter any year to check leap year or Not :");
//            int year=sc.nextInt();
//            if(year%4==0)
//            {
//                System.out.println("Leap year");
//    }
//            else
//            {
//                System.out.println("Not Leap year");
//            }
            //6. Solution ---------------------------------------
//        System.out.println("ENter URL to find their types:");
//        String website= sc.nextLine();
//            if(website.endsWith(".in"))
//            {
//                System.out.println("This is indian Website");
//            }
//            else if(website.endsWith(".com")){
//                System.out.println("This is commercial website");
//            }
//            else if(website.endsWith(".org"))
//            {
//                System.out.println("THis is Organizational website");
//
//            }

    }
}
