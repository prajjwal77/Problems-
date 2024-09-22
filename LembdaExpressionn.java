
interface car2{
	void drive();
}
interface car3{
	void average( int avg);
}
public class LembdaExpressionn {
	public static void main(String[] args) {
//		car2 objCar2 = ( )->{
//			System.out.println("Driving Car2 ....");
//		};
//		objCar2.drive();
//	}
	
	car3 objCar3 =(int avg)->System.out.println("Avg....." + avg);
	objCar3.average(29);
	
	}
}
