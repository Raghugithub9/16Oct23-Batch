
public class ConcatandCondi {

	public static void main(String[] args) {
		
int a=10;
int b=20;
String st="Java";

System.out.println(a+b);

System.out.println("a"+"b");

System.out.println(st+a+b);

System.out.println(a+b+st+a+b);


//condition operator
if(b>a) {
	System.out.println("a is greater");
}else {
	System.out.println("b is greater");
}

int c=100;
//****************************************************

if(a>b && a>c) {
	System.out.println("a is greatest");
}else if(b>c) {
	System.out.println("b is greatest");
}else {
	System.out.println("c is greatest "+c);
}













		

	}

}
