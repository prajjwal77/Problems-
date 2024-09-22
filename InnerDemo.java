class A{
	public void show() {
		System.out.println("In show....");
	}
	class B{
		public void display() {
			System.out.println("In display....");
		}
	}
}
public class InnerDemo {
	public static void main(String[] args) {
		 A obj = new A();
		 A.B obj1 =obj.new B();
		 
		 obj.show();
		 obj1.display();
	}
}
