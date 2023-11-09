package Access1;

public class protectedExample {

	public static void main(String[] args) {
		protectedExample pe1=new protectedExample();
		pe1.protectedtest();

	}
	protected void protectedtest() {
		System.out.println("protectedtest");
	}
}
