import java.util.List;

public class FunctionalAndStructural {
    public static void main(String[] args) {
        printALLNumberInListStructured(List.of(12,9,13,4,6,2,4,12,15));
        printALLEvenInListStructured(List.of(12,9,13,4,6,2,4,12,15));
        printALLOddInListStructured(List.of(12,9,13,4,6,2,4,12,15));
        List<String>courses =List.of("Spring","Spring Boot","API","Microservices","PCF","AWS","Docker","Kubernet");
        printCourses(courses);
        filterCourses(courses);
        filterCoursesHave4Letters(courses);
        List<Integer>newNumbers=List.of(2,4,6,8,10,11,3,9);
        printSquare(newNumbers);
        printEvenSquare(newNumbers);
        printOddSquare(newNumbers);
        lenghtOfCourses(courses);
    }
private static void print(int num){
    System.out.println(num);
}
    public static void printALLNumberInListStructured(List<Integer>numbers) {
       //Structural Programming .............
//        for(int num : numbers) {
//            System.out.println(num);
//        }
        //Functional Programming
        numbers.stream()
                //.forEach(FunctionalAndStructural::print);//Method reference
                .forEach(System.out::println);
    }
    public static boolean isEven(int num){
        return num%2==0;
    }
    public static boolean isOdd(int num){
        return num%2!=0;
    }
    public static void printALLEvenInListStructured(List<Integer>numbers) {
        //Structural Programming .............
//        for(int num : numbers) {
//            System.out.println(num);
//        }
        //Functional Programming
        numbers.stream()
                .filter(FunctionalAndStructural::isEven)
                .forEach(System.out::println);//Method reference
    }
    public static void printALLOddInListStructured(List<Integer>numbers) {

        //Functional Programming
        numbers.stream()
                //.filter(FunctionalAndStructural::isOdd)
                .filter(number->number%2!=0)
                .forEach(System.out::println);//Method reference
    }

    public static void printCourses(List<String> str){
      str.stream()
              .forEach(System.out::println);
    }

    public static void filterCourses(List<String> str){
        str.stream()
                .filter(str1-> str1.contains("Spring"))
                .forEach(System.out::println);
    }

    public static void filterCoursesHave4Letters(List<String> str){
        str.stream()
                .filter(str1-> str1.length()<=4)
                .forEach(System.out::println);
    }
    public static void printSquare(List<Integer>numbers){
        numbers.stream()
               // .filter(num -> num%2==0)
                .map(number-> number*number)
                .forEach(System.out::println);
    }
    public static void printEvenSquare(List<Integer>numbers){
        numbers.stream()
                .filter(num -> num%2==0)
                .map(number-> number*number)
                .forEach(System.out::println);
    }
    public static void printOddSquare(List<Integer>numbers){
        numbers.stream()
                .filter(num -> num%2!=0)
                .map(number-> number*number)
                .forEach(System.out::println);
    }

    public static void lenghtOfCourses(List<String> str){
        str.stream()
                .map(str1->str1.length())
                .forEach(System.out::println);
    }

}
