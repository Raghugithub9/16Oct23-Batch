package Functions;

public class constructorExample {
	
	
	//Constructor overloading
	//constructor
	public constructorExample() {
		System.out.println("Java class");
	}
	//constructor
		public constructorExample(int a) {
			System.out.println(a);
		}
	
	

	public static void main(String[] args) {
		
		constructorExample ce=new constructorExample();
		constructorExample ce1=new constructorExample();
		constructorExample ce2=new constructorExample(12345);
		constructorExample ce3=new constructorExample();
		constructorExample ce4=new constructorExample();
		
		ce.print();

	}
	
	public void print() {
		System.out.println("Print");
	}

}
