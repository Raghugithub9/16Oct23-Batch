package inheritance;

public class ParentExample  {

	public static void main(String[] args) {
		
		ParentExample pe=new ParentExample();
		pe.test();
		pe.Parent();
		
	}
	
	public void test() {
		System.out.println("Parent Test");
	}
	public void Parent() {
		System.out.println("Parent ");
	}

}
