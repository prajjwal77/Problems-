package GenericInJava;

	class Gen<T>{
		T obj;
		public Gen (T obj) {
			this.obj=obj;
		}
		void disp() {
			System.out.println("The Type Of Data is : "+obj.getClass().getName());
		}
		public T getObj() {
			return obj;
		}
	}
public class GenericInJava {
	public static void main(String[] args) {
		Gen<Integer> gen = new Gen<Integer>(10);
		gen.disp();
		System.out.println(gen.getObj());
		
		System.out.println("*********************************");
		
		Gen<String> gen1 = new Gen<String>("PW");
		gen1.disp();
		System.out.println(gen1.getObj());
	}
}
