package OOPS;

public class RaghuBank implements Bank{

	
	public static void main(String[] args) {
		
		RaghuBank rb=new RaghuBank();
		rb.credit();
		rb.savings();
		rb.loan();
		rb.insurance();
		rb.newtest();
		
	Bank b=new RaghuBank();
	b.credit();
	b.savings();
	b.loan();
	b.insurance();
	//b.newtest();

	}

	public void credit() {
		System.out.println("credit");
	}
public void savings() {
	System.out.println("savings");
	}
public void loan() {
	System.out.println("loan");
}
public void insurance() {
	System.out.println("insurance");
}

public void newtest() {
	System.out.println("newtest");
}


}
