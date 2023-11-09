package inheritance;

public class ChildExample extends ParentExample {

	public static void main(String[] args) {
		
		ChildExample ce=new ChildExample();
		ce.test();
ce.child();
ce.Parent();
ce.test();

	}
	
	
	public void child() {
		System.out.println("Child ");
	}

}
