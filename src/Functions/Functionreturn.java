package Functions;

public class Functionreturn {

	public static void main(String[] args) {
		
		Functionreturn f1=new Functionreturn();
		int a1=f1.add(120, 230);
		int d=235;
		int e=d+a1;
		System.out.println(e);
		
	}
	
	public int add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c; 
		
	}

}
