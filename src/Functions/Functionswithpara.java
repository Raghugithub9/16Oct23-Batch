package Functions;

public class Functionswithpara {

	public static void main(String[] args) {
		
		Functionswithpara f1=new Functionswithpara();
		f1.add();
		f1.add();
		f1.add();
		
		f1.addition(200, 400);
		
		f1.addition(123, 234);
		
		f1.addition(2223, 23224);
		
		f1.add("Selenium with Java");
		
		f1.add("Selenium with Python");
		
		f1.add("Selenium with Ruby");
		
		f1.add(12345);
	}
	
	public void add() {
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
//Method overloading
	public void addition(int d,int e) {
		int f=d+e;
		System.out.println(f);
	}
	
	public void add(String st) {
		System.out.println(st);
	}
	
	public void add(int ac) {
		System.out.println(ac);
	}
	
}
