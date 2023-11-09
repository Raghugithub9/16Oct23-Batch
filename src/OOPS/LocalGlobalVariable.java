package OOPS;

public class LocalGlobalVariable {

	static int c=30;//global variable 
	
	public static void main(String[] args) {
		
int a=10;//local variable
System.out.println(a);
//System.out.println(b);
System.out.println(c);

	}
	
	public  void test() {
		
		int b=20;//local variable
		//System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		
	}

}
