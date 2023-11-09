package OOPS;

public class TestHasan extends HasanBank{

	public static void main(String[] args) {
		TestHasan ts=new TestHasan();
		ts.credit();
		ts.savings();
		ts.loan();
		ts.insurance();

	}

	@Override
	public void credit() {
		System.out.println("credit");
		
	}

	@Override
	public void savings() {
		System.out.println("savings");
		
	}

}
