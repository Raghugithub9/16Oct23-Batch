package Java;


public class tryCatchExample {

	public static void main(String[] args) {
	
try {		
System.out.println("start of the Program");		
int a=10;
System.out.println("After Initializing");	
int b=a/0;
System.out.println("After division");	
System.out.println(b);
System.out.println("After print b");		
}
catch (Exception e) {
	e.printStackTrace();
	e.getMessage();
	System.out.println("catch block");
}

finally{
	System.out.println("Mandatory");
}
	

}
}