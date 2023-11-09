
public class loopsExample {

	public static void main(String[] args) {
		
//a++ increment - a+1
		
for(int a=0;a<10;a++) {
	System.out.println(a+" This is Selenium with Java sessions");
}
		
System.out.println("***********************");
//nested for loop
for(int i=0;i<5;i++) {//i=0,1,2
	System.out.println("Value of i is "+i+" This is Selenium ");
	for(int j=0;j<3;j++) {//j=0,1,2...0,1,2
		System.out.println("Value of j is "+j+" This is Selenium with Java sessions");
	}
}

	}

}
