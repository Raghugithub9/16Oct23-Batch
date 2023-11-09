package OOPS;

public class functionsExample {

	public static void main(String[] args) {
		
		add();
		functionsExample.add();
		functionsExample.add();
		functionsExample.add();
		functionsExample.add();
		
		functionsExample f=new functionsExample();
		//f - object reference
		//new functionsExample() - object
		f.test();
		functionsExample f1=new functionsExample();
		functionsExample f2=new functionsExample();
		functionsExample f3=new functionsExample();
		functionsExample f4=new functionsExample();
		functionsExample f5=new functionsExample();
	}
	
	
	public static void add() {
		System.out.println("Print method add");
	}
	
	public  void test() {
		System.out.println("Print method add");
	}
	
	

}
